package nyu.bookstore.edu.service;

import nyu.bookstore.edu.domain.ShippingAddress;
import nyu.bookstore.edu.domain.UserShipping;

public interface ShippingAddressService {
    ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
