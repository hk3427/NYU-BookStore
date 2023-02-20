package nyu.bookstore.edu.service.impl;

import nyu.bookstore.edu.domain.Product;
import nyu.bookstore.edu.repository.ProductRepository;
import nyu.bookstore.edu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        List<Product> productList = (List<Product>) productRepository.findAll();
        List<Product> activeProductList = new ArrayList<>();
        for (Product product : productList) {
            if (product.isActive()) {
                activeProductList.add(product);
            }
        }
        return activeProductList;
    }

    public Product findOne(Long id) {
        return productRepository.findById(id).get();
    }

    public List<Product> findByCategory(String category) {
        List<Product> productList = productRepository.findByCategory(category);
        List<Product> activeProductList = new ArrayList<>();
        for (Product product : productList) {
            if (product.isActive()) {
                activeProductList.add(product);
            }
        }
        return activeProductList;
    }

    public List<Product> blurrySearch(String productName) {
        List<Product> productList = productRepository.findByProductNameContaining(productName);
        List<Product> activeProductList = new ArrayList<>();
        for (Product product : productList) {
            if (product.isActive()) {
                activeProductList.add(product);
            }
        }
        return activeProductList;
    }
}
