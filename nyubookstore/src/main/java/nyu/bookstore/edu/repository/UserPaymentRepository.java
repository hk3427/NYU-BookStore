package nyu.bookstore.edu.repository;

import nyu.bookstore.edu.domain.UserPayment;
import org.springframework.data.repository.CrudRepository;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long> {

}
