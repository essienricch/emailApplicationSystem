package api.email_system.data.repository;

import api.email_system.data.model.Inbox;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InboxRepository extends JpaRepository <Inbox, Long> {
}
