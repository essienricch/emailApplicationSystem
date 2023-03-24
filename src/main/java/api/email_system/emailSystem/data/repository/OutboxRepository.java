package api.email_system.emailSystem.data.repository;

import api.email_system.emailSystem.data.model.Outbox;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutboxRepository extends JpaRepository <Outbox, Long> {
}
