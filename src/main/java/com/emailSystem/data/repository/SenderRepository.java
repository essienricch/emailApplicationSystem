package api.email_system.data.repository;

import api.email_system.data.model.Sender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SenderRepository extends JpaRepository <Sender, Long> {
}
