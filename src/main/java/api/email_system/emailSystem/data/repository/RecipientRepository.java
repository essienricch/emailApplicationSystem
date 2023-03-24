package api.email_system.emailSystem.data.repository;

import api.email_system.emailSystem.data.model.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipientRepository extends JpaRepository <Recipient, Long> {
}
