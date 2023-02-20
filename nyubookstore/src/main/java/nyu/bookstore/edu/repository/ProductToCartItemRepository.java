package nyu.bookstore.edu.repository;

import nyu.bookstore.edu.domain.CartItem;
import nyu.bookstore.edu.domain.ProductToCartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductToCartItemRepository extends CrudRepository<ProductToCartItem, Long> {
    void deleteByCartItem(CartItem cartItem);
}
