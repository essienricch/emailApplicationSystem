package api.email_system.mapper;

import api.email_system.data.dto.userDto.request.RegisterUserRequest;
import api.email_system.data.model.AppUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.random.*;


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
