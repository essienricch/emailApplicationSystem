package api.email_system.data.dto.userDto.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserResponse {

    private Long userId;
    private String message;
    private String emailAddress;


}
