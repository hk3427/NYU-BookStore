package nyu.bookstore.edu.repository;

import nyu.bookstore.edu.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
