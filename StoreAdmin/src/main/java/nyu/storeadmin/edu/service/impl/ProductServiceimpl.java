package nyu.storeadmin.edu.service.impl;

import nyu.storeadmin.edu.domain.Product;
import nyu.storeadmin.edu.repository.ProductRepository;
import nyu.storeadmin.edu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceimpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    public Product findOne(Long id) {
        return productRepository.findById(id).get();
    }

    public void removeOne(Long id) {
        productRepository.deleteById(id);
    }
}
