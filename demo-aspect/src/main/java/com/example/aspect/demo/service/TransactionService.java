package com.example.aspect.demo.service;

import com.example.aspect.demo.entity.Transaction;

import java.util.Optional;


/**
 * Created by keerthanadevi on Mar, 2019
 */

public interface TransactionService {
    void saveTransaction(Transaction transaction);
    //Optional<Transaction> loginCustomer(Long customerId, String password);
    //Optional<Transaction> findCustomerById(Long customerId);
}
