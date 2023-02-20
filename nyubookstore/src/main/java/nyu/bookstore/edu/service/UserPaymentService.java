package nyu.bookstore.edu.service;

import nyu.bookstore.edu.domain.UserPayment;

public interface UserPaymentService {
    UserPayment findById(Long id);

    void removeById(Long id);
}
