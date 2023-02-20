package nyu.bookstore.edu.service;

import nyu.bookstore.edu.domain.*;

public interface OrderService {
    Order createOrder(ShoppingCart shoppingCart,
                      ShippingAddress shippingAddress,
                      BillingAddress billingAddress,
                      Payment payment,
                      String shippingMehod,
                      User user);

    Order findOne(Long id);
}
