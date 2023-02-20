package nyu.bookstore.edu;

import nyu.bookstore.edu.domain.User;
import nyu.bookstore.edu.domain.security.Role;
import nyu.bookstore.edu.domain.security.UserRole;
import nyu.bookstore.edu.service.UserService;
import nyu.bookstore.edu.utility.SecurityUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class NyuBookstoreApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(NyuBookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("Akhil");
		user1.setLastName("Chandrashekar");
		user1.setUsername("Akhil");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("password"));
		user1.setEmail("ab10138@nyu.edu");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));

		userService.createUser(user1, userRoles);
	}
}
