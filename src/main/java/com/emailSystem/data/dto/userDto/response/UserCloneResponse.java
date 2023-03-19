package api.email_system.data.dto.userDto.response;

import api.email_system.data.model.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCloneResponse {

    private Long userId;
    private String firstName;
    private String lastName;

    private Address address;

    private String phoneNumber;

    private String profileImg;


}
