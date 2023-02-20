package nyu.bookstore.edu.service.impl;

import nyu.bookstore.edu.domain.UserShipping;
import nyu.bookstore.edu.repository.UserShippingRepository;
import nyu.bookstore.edu.service.UserShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserShippingServiceImpl implements UserShippingService {

    @Autowired
    private UserShippingRepository userShippingRepository;

    public UserShipping findById(Long id) {
        return userShippingRepository.findById(id).get();
    }

    public void removeById(Long id) {
        userShippingRepository.deleteById(id);
    }
}
