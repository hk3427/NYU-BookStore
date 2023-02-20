package nyu.storeadmin.edu.service;

import nyu.storeadmin.edu.domain.Product;
import java.util.List;

public interface ProductService {

    Product save(Product product);
    List<Product> findAll();
    Product findOne(Long id);
    void removeOne(Long id);
}
