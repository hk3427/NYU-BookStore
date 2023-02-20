package nyu.bookstore.edu.service;


import nyu.bookstore.edu.domain.UserShipping;

public interface UserShippingService {
    UserShipping findById(Long id);

    void removeById(Long id);
}
