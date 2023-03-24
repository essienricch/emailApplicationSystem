package api.email_system.emailSystem.data.repository;

import api.email_system.emailSystem.data.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository <Address, Long> {
}
