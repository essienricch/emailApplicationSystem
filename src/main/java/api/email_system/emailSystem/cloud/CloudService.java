package api.email_system.emailSystem.cloud;

import org.springframework.web.multipart.MultipartFile;

public interface CloudService {

    String upload(MultipartFile image);
}
