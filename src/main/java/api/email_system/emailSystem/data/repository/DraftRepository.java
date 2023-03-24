package api.email_system.emailSystem.data.repository;

import api.email_system.emailSystem.data.model.Draft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DraftRepository extends JpaRepository <Draft, Long> {
}
