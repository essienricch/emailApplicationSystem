package api.email_system.data.repository;

import api.email_system.data.model.Draft;
import org.hibernate.query.criteria.JpaDerivedRoot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DraftRepository extends JpaRepository <Draft, Long> {
}
