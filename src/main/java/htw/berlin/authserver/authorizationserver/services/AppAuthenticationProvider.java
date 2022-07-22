package htw.berlin.authserver.authorizationserver.services;

import htw.berlin.authserver.authorizationserver.persistence.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;



@Component
public class AppAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private AppUserDetailsService appUserDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password= authentication.getCredentials().toString();
        CustomUserDetails user = (CustomUserDetails) appUserDetailsService.loadUserByUsername(username);
        return checkCredentials(user, password);
    }



    private Authentication checkCredentials(CustomUserDetails user, String password) {

        if (passwordEncoder.matches(password, user.getPassword())){
            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword(), user.getAuthorities());
            return usernamePasswordAuthenticationToken;
        }else {
            throw new BadCredentialsException("Bad Credentials");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }

}