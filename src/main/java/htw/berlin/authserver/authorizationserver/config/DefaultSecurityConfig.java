package htw.berlin.authserver.authorizationserver.config;

import htw.berlin.authserver.authorizationserver.services.AppUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class DefaultSecurityConfig  {


    @Autowired
    private AppUserDetailsService appUserDetailsService;

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(appUserDetailsService);
//    }

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .antMatchers("/login").permitAll()
                                .antMatchers("/login.html").permitAll()
                                .antMatchers("/login-error.html").permitAll()
                                .antMatchers("/sign-up/**").permitAll()
                                .antMatchers("/sign-up.html").permitAll()
                                .anyRequest().authenticated()
                )
                .formLogin()
                .loginPage("/login.html")
                .failureUrl("/login-error.html")
                .and()
                .logout()
                .logoutSuccessUrl("http://localhost:8080/index.html");
//                .formLogin(withDefaults());
        return http.build();
    }

//    @Bean
//    UserDetailsService users() {
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("user1")
//                .password("password")
//                .roles("USER")
//                .build();
//        return new InMemoryUserDetailsManager(user);
//    }

}
