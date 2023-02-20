package nyu.storeadmin.edu.service;

import nyu.storeadmin.edu.domain.User;
import nyu.storeadmin.edu.domain.security.UserRole;
import java.util.Set;

public interface UserService {
    User createUser(User user, Set<UserRole> userRoles) throws Exception;
    User save(User user);
}
