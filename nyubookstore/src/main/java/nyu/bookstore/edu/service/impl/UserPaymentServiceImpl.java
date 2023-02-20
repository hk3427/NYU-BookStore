package nyu.bookstore.edu.service.impl;

import nyu.bookstore.edu.domain.UserPayment;
import nyu.bookstore.edu.repository.UserPaymentRepository;
import nyu.bookstore.edu.service.UserPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPaymentServiceImpl implements UserPaymentService {

    @Autowired
    private UserPaymentRepository userPaymentRepository;

    public UserPayment findById(Long id) {
        return userPaymentRepository.findById(id).get();
    }

    public void removeById(Long id) {
        userPaymentRepository.deleteById(id);
    }
}
