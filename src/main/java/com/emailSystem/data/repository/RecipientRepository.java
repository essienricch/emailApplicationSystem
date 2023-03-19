package api.email_system.data.repository;

import api.email_system.data.model.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipientRepository extends JpaRepository <Recipient, Long> {
}
