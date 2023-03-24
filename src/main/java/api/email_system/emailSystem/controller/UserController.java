package api.email_system.emailSystem.controller;

import api.email_system.emailSystem.data.dto.userDto.request.RegisterUserRequest;
import api.email_system.emailSystem.data.dto.userDto.response.RegisterUserResponse;
import api.email_system.emailSystem.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping("/register")
    public ResponseEntity <?> registerUser(@RequestBody RegisterUserRequest registerUserRequest){
//        var userResponse = userService.registerUser(registerUserRequest);
        return ResponseEntity.ok("Hello");
       // return ResponseEntity.status(HttpStatus.CREATED.value()).body(userResponse);
    }


}
