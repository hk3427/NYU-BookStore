package nyu.storeadmin.edu.repository;

import nyu.storeadmin.edu.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
