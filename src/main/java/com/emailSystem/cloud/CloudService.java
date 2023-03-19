package api.email_system.cloud;

import org.springframework.web.multipart.MultipartFile;

public interface CloudService {

    String upload(MultipartFile image);
}
