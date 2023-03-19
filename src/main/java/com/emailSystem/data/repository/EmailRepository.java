package api.email_system.data.repository;

import api.email_system.data.model.Mail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository <Mail,Long> {
}
