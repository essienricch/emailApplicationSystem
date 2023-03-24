package api.email_system.service;

import api.email_system.EmailSystemApplication;
import api.email_system.emailSystem.data.dto.userDto.request.RegisterUserRequest;
import api.email_system.emailSystem.data.model.Gender;
import api.email_system.emailSystem.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ContextConfiguration
@SpringBootTest(classes = EmailSystemApplication.class)
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    private RegisterUserRequest userRequest;

    @BeforeEach
    void setUp(){
        userRequest.setFirstName("Asake");
        userRequest.setLastName("Ololade");
        userRequest.setGender(Gender.MALE);
        userRequest.setPhoneNumber("09023123454");
        userRequest.setPassword("2023");

    }

    @Test
    void registerUserRequestTest(){
        var response = userService.registerUser(userRequest);
        System.out.println(response.getMessage());
        assertThat(response).isNotNull();

    }

}