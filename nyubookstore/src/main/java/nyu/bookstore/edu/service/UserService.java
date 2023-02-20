package nyu.bookstore.edu.service;

import nyu.bookstore.edu.domain.User;
import nyu.bookstore.edu.domain.UserBilling;
import nyu.bookstore.edu.domain.UserPayment;
import nyu.bookstore.edu.domain.UserShipping;
import nyu.bookstore.edu.domain.security.PasswordResetToken;
import nyu.bookstore.edu.domain.security.UserRole;

import java.util.Set;

public interface UserService {
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);

    User findByUsername(String username);

    User findByEmail(String email);

    User findById(Long id);

    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);

    void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);

    void updateUserShipping(UserShipping userShipping, User user);

    void setUserDefaultPayment(Long userPaymentId, User user);

    void setUserDefaultShipping(Long userShippingId, User user);
}
