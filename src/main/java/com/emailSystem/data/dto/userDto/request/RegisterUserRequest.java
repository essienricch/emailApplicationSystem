package api.email_system.data.dto.userDto.request;

import api.email_system.data.model.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegisterUserRequest {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    private Gender gender;

    private String password;
}
