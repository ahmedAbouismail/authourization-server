package htw.berlin.authserver.authorizationserver.services.user;

import htw.berlin.authserver.authorizationserver.dto.UserDto;
import htw.berlin.authserver.authorizationserver.exceptions.UserAlreadyExistException;
import htw.berlin.authserver.authorizationserver.persistence.AppUserEntity;
import htw.berlin.authserver.authorizationserver.persistence.IAppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements IUserService{


    @Autowired
    private final IAppUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public UserServiceImpl(IAppUserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public AppUserEntity registerNewUserAccount(UserDto userDto) {
        if (isUserExist(userDto.getEmail())) {
            throw new UserAlreadyExistException("There is an account with that email address: " + userDto.getEmail());
        }

        AppUserEntity userEntity = new AppUserEntity(userDto.getFirstName(), userDto.getLastName(), userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()), "ROLE_USER", true);

        return userRepository.save(userEntity);
    }

    @Override
    public boolean isUserExist(String email) {
        return userRepository.existsByEmail(email);
    }
}
