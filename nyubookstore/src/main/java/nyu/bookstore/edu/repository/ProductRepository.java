package nyu.bookstore.edu.repository;

import nyu.bookstore.edu.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByCategory(String category);
    List<Product> findByProductNameContaining(String productName);
}
