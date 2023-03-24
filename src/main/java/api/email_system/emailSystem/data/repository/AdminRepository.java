package api.email_system.emailSystem.data.repository;

import api.email_system.emailSystem.data.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository  extends JpaRepository <Admin, Long> {
}
