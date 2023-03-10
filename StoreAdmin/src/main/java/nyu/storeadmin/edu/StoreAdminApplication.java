package nyu.storeadmin.edu;

import nyu.storeadmin.edu.domain.User;
import nyu.storeadmin.edu.domain.security.Role;
import nyu.storeadmin.edu.domain.security.UserRole;
import nyu.storeadmin.edu.service.UserService;
import nyu.storeadmin.edu.utility.SecurityUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class StoreAdminApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(StoreAdminApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User();
        user1.setUsername("admin");
        user1.setPassword(SecurityUtility.passwordEncoder().encode("admin"));
        user1.setEmail("admin@gmail.com");
        user1.setFirstName("Admin");
        user1.setLastName("Admin");
        Set<UserRole> userRoles = new HashSet<>();
        Role role1 = new Role();
        role1.setRoleId(0);
        role1.setName("ROLE_ADMIN");
        userRoles.add(new UserRole(user1, role1));

        userService.createUser(user1, userRoles);
    }
}
