package api.email_system.data.repository;

import api.email_system.data.model.Outbox;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutboxRepository extends JpaRepository <Outbox, Long> {
}
