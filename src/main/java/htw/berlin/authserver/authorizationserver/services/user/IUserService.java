package htw.berlin.authserver.authorizationserver.services.user;

import htw.berlin.authserver.authorizationserver.dto.UserDto;
import htw.berlin.authserver.authorizationserver.persistence.AppUserEntity;

public interface IUserService {
    AppUserEntity registerNewUserAccount(UserDto userDto);
    boolean isUserExist(String email);
}
