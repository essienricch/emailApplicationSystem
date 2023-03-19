package api.email_system.data.repository;

import api.email_system.data.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface AppUserRepository extends JpaRepository <AppUser,Long> {
    boolean existsAppUserByEmailAddress(String emailAddress);
}
