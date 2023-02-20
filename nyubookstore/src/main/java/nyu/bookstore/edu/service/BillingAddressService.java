package nyu.bookstore.edu.service;

import nyu.bookstore.edu.domain.BillingAddress;
import nyu.bookstore.edu.domain.UserBilling;

public interface BillingAddressService {
    BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
