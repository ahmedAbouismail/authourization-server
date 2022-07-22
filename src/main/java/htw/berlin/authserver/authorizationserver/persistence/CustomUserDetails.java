package htw.berlin.authserver.authorizationserver.persistence;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import java.util.*;


public class CustomUserDetails implements UserDetails {

    private final int studentId;

    private final Collection<? extends GrantedAuthority> authorities;

    private final String password;

    private final String username;

    private final boolean isAccountNonExpired;

    private final boolean isAccountNonLocked;

    private final boolean isCredentialsNonExpired;

    private final boolean isEnabled;

    public CustomUserDetails(int studentId, Collection<? extends GrantedAuthority> authorities, String password, String username, boolean isAccountNonExpired, boolean isAccountNonLocked, boolean isCredentialsNonExpired, boolean isEnabled) {
        this.studentId = studentId;
        this.authorities = authorities;
        this.password = password;
        this.username = username;
        this.isAccountNonExpired = isAccountNonExpired;
        this.isAccountNonLocked = isAccountNonLocked;
        this.isCredentialsNonExpired = isCredentialsNonExpired;
        this.isEnabled = isEnabled;
    }

    public int getStudentId(){
        return studentId;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

}
