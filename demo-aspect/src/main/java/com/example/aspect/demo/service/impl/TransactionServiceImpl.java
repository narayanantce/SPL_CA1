package com.example.aspect.demo.service.impl;

import java.util.Optional;

import com.example.aspect.demo.entity.Transaction;
import com.example.aspect.demo.repository.TransactionRepository;
import com.example.aspect.demo.service.TransactionService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by keerthanadevi on Mar, 2019
 */

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@Component(value="transactionImpl")
public class TransactionServiceImpl implements TransactionService {
    private TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }
    @Override
    public void saveTransaction(Transaction transaction) {
        this.transactionRepository.save(transaction);
    }

   /* @Override
    public Optional<TransactionRepository> loginCustomer(Long customerId, String password) {
        return this.customerRepository.findById(customerId).filter(customer -> customer.getPassword().equals(password));
    }

    @Override
    public Optional<TransactionRepository> findCustomerById(Long customerId) {
        return this.customerRepository.findById(customerId);
    }*/
}

