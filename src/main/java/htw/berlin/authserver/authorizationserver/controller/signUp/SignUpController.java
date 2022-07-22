package htw.berlin.authserver.authorizationserver.controller.signUp;

import htw.berlin.authserver.authorizationserver.dto.UserDto;
import htw.berlin.authserver.authorizationserver.exceptions.UserAlreadyExistException;
import htw.berlin.authserver.authorizationserver.persistence.AppUserEntity;
import htw.berlin.authserver.authorizationserver.services.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class SignUpController {

    @Autowired
    private final IUserService userService;

    public SignUpController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/sign-up")
    public String signup(Model model){
        UserDto user = new UserDto();

        model.addAttribute("user", user);
        return "sign-up";
    }

//    @PostMapping(value = "/sign-up")
//    public ModelAndView registerUserAccount(@ModelAttribute("user") @Valid UserDto userDto,  BindingResult bindingResult, Model model){
//        if (bindingResult.hasErrors()){
//            return new ModelAndView("sign-up");
//        }else{
//            try {
//                AppUserEntity user = userService.registerNewUserAccount(userDto);
//            }catch (UserAlreadyExistException userAlreadyExistException){
//                return new ModelAndView("sign-up").addObject("emailExist", userAlreadyExistException.getMessage());
//            }
//        }
//        return new ModelAndView("login");
//    }

    @PostMapping(value = "/sign-up")
    public String registerUserAccount(@ModelAttribute("user") @Valid UserDto userDto,  BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "sign-up";
        }else{
            try {
                AppUserEntity user = userService.registerNewUserAccount(userDto);
            }catch (UserAlreadyExistException userAlreadyExistException){
                model.addAttribute("emailExist", userAlreadyExistException.getMessage());
                return "sign-up";
            }
        }
        String s = UriComponentsBuilder.fromUriString("http://localhost:8080/index.html").build().toString();
        return "redirect:" + s;
    }


}
