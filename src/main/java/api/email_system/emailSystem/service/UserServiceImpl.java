package api.email_system.emailSystem.service;

import api.email_system.emailSystem.data.dto.userDto.request.UpdateUserRequest;
import api.email_system.emailSystem.data.dto.userDto.response.UserCloneResponse;
import api.email_system.emailSystem.data.repository.AppUserRepository;
import api.email_system.emailSystem.mapper.MyParraMapper;
import api.email_system.emailSystem.data.dto.userDto.request.RegisterUserRequest;
import api.email_system.emailSystem.data.dto.userDto.response.RegisterUserResponse;
import api.email_system.emailSystem.data.dto.userDto.response.UpdateUserResponse;
import api.email_system.emailSystem.data.model.AppUser;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@AllArgsConstructor
@Slf4j
@Service
public class UserServiceImpl implements UserService{


    private final AppUserRepository appUserRepository;



    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest) {
//        AppUser appUser = AppUser.builder().firstName(registerUserRequest.getFirstName())
//                .lastName(registerUserRequest.getLastName())
//                .phoneNumber(registerUserRequest.getPhoneNumber())
//                .password(registerUserRequest.getPassword())
//                .createdAt(LocalDateTime.now())
//                .build();
        String email = generateMailAddress(registerUserRequest);
        System.out.println(email);
        AppUser appUser = MyParraMapper.mapToUser(registerUserRequest);
        appUser.setEmailAddress(email);
      AppUser savedUser =  appUserRepository.save(appUser);
      return RegisterUserResponse.builder()
              .userId(savedUser.getId())
              .message("Registration successful")
              .emailAddress(savedUser.getEmailAddress())
              .build();
    }

    private String generateMailAddress(RegisterUserRequest registerUserRequest) {
        int intDigit = new Random().nextInt(100);
        String fresh;
        if (registerUserRequest.getLastName().length() > 3 && registerUserRequest.getFirstName().length() > 3){
            fresh = registerUserRequest.getLastName() + registerUserRequest.getFirstName() +
                    intDigit +
                    "@ricchmail.com";
        }else {
            fresh = registerUserRequest.getFirstName() + registerUserRequest.getLastName() +
                    intDigit +
                    "@ricchmail.com";
        }
        return fresh.toLowerCase();
    }

    @Override
    public void saveUser(AppUser appUser) {

    }

    @Override
    public UserCloneResponse getUserById(Long userId) {
        return null;
    }

    @Override
    public Optional<AppUser> findUserById(Long userId) {
        return Optional.empty();
    }

    @Override
    public Page<AppUser> getAllUser(int pageNumber) {
        return null;
    }

    @Override
    public UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }
}
