package nyu.storeadmin.edu.repository;

import nyu.storeadmin.edu.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByName(String name);
}
