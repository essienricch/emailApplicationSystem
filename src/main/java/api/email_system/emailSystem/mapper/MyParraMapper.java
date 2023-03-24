package api.email_system.emailSystem.mapper;

import api.email_system.emailSystem.data.dto.userDto.request.RegisterUserRequest;
import api.email_system.emailSystem.data.model.AppUser;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
public class MyParraMapper {

    public static AppUser mapToUser(RegisterUserRequest registerUserRequest){
        return AppUser.builder()
                .firstName(registerUserRequest.getFirstName())
                .lastName(registerUserRequest.getLastName())
                .phoneNumber(registerUserRequest.getPhoneNumber())
                .gender(registerUserRequest.getGender())
                .password(registerUserRequest.getPassword())
                .createdAt(LocalDateTime.now())
                .build();
    }

}
