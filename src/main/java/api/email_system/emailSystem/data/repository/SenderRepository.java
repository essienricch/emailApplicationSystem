package api.email_system.emailSystem.data.repository;

import api.email_system.emailSystem.data.model.Sender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SenderRepository extends JpaRepository <Sender, Long> {
}
