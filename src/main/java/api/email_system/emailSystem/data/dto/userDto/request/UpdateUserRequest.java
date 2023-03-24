package api.email_system.emailSystem.data.dto.userDto.request;

import com.github.fge.jsonpatch.JsonPatch;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRequest {

    private Long userId;
    private JsonPatch updatePayload;
}
