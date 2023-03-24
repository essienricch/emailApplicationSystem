package api.email_system.emailSystem.data.repository;

import api.email_system.emailSystem.data.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppUserRepository extends JpaRepository <AppUser,Long> {
    boolean existsAppUserByEmailAddress(String emailAddress);
}
