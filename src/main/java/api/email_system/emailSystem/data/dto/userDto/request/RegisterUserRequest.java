package api.email_system.emailSystem.data.dto.userDto.request;

import api.email_system.emailSystem.data.model.Gender;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RegisterUserRequest {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    private Gender gender;

    private String password;
}
