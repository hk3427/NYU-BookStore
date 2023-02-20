package nyu.bookstore.edu.service;

import nyu.bookstore.edu.domain.Payment;
import nyu.bookstore.edu.domain.UserPayment;

public interface PaymentService {
    Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
