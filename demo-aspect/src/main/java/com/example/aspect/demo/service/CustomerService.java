package com.example.aspect.demo.service;

import com.example.aspect.demo.entity.Customer;

import java.util.Optional;

/**
 * Created by keerthanadevi on Mar, 2019
 */

public interface CustomerService {
    // void saveOrCustomer(Customer customer);
    //Optional<Customer> loginCustomer(Long customerId, String password);
    Optional<Customer> findCustomerById(Long customerId);
}
