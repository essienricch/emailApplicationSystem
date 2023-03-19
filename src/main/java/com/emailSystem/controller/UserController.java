package api.email_system.controller;

import api.email_system.data.dto.userDto.request.RegisterUserRequest;
import api.email_system.data.dto.userDto.response.RegisterUserResponse;
import api.email_system.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping("/register")
    public ResponseEntity <RegisterUserResponse> registerUser(@RequestBody RegisterUserRequest registerUserRequest){
        var userResponse = userService.registerUser(registerUserRequest);
        return ResponseEntity.ok(userResponse);
       // return ResponseEntity.status(HttpStatus.CREATED.value()).body(userResponse);
    }


}
