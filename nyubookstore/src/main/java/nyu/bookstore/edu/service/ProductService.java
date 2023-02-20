package nyu.bookstore.edu.service;

import nyu.bookstore.edu.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findOne(Long id);

    List<Product> findByCategory(String category);

    List<Product> blurrySearch(String productName);
}
