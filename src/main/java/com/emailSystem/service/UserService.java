package api.email_system.service;

import api.email_system.data.dto.userDto.request.RegisterUserRequest;
import api.email_system.data.dto.userDto.request.UpdateUserRequest;
import api.email_system.data.dto.userDto.response.RegisterUserResponse;
import api.email_system.data.dto.userDto.response.UpdateUserResponse;
import api.email_system.data.dto.userDto.response.UserCloneResponse;
import api.email_system.data.model.AppUser;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface UserService {

    RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest);

    void saveUser(AppUser appUser);

    UserCloneResponse getUserById(Long userId);

    Optional <AppUser> findUserById(Long userId);

    Page <AppUser> getAllUser(int pageNumber);
    UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest);

    void deleteUser(Long userId);


}
