package api.email_system.emailSystem.data.repository;

import api.email_system.emailSystem.data.model.Inbox;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InboxRepository extends JpaRepository <Inbox, Long> {
}
