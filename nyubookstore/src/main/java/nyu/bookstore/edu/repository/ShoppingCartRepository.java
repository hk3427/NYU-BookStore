package nyu.bookstore.edu.repository;

import nyu.bookstore.edu.domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
