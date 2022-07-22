package htw.berlin.authserver.authorizationserver.dto;



import htw.berlin.authserver.authorizationserver.constraint.annotation.PasswordMatches;
import htw.berlin.authserver.authorizationserver.constraint.annotation.ValidEmail;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@PasswordMatches
public class UserDto {
    @NotNull
    @NotEmpty
    private String firstName;

    @NotNull
    @NotEmpty
    private String lastName;

    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;
    
    @Email
    @NotNull
    @NotEmpty
    private String email;

    public UserDto() {
        firstName = null;
        lastName = null;
        password = null;
        matchingPassword = null;
        email = null;
    }

    public UserDto(String firstName, String lastName, String password, String matchingPassword, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.matchingPassword = matchingPassword;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
