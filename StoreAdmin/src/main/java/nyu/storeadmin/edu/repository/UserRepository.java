package nyu.storeadmin.edu.repository;

import nyu.storeadmin.edu.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
