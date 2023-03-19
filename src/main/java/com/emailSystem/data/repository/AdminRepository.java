package api.email_system.data.repository;

import api.email_system.data.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository  extends JpaRepository <Admin, Long> {
}
