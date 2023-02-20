package nyu.bookstore.edu.repository;

import nyu.bookstore.edu.domain.CartItem;
import nyu.bookstore.edu.domain.Order;
import nyu.bookstore.edu.domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long> {
    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
    List<CartItem> findByOrder(Order order);
}
