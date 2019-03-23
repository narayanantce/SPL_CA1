package com.example.aspect.demo.service.impl;

import java.util.Optional;

import com.example.aspect.demo.entity.Customer;
import com.example.aspect.demo.repository.CustomerRepository;
import com.example.aspect.demo.service.CustomerService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.NoArgsConstructor;

/**
 * Created by keerthanadevi on Mar, 2019
 */


@Service
@NoArgsConstructor
@Component(value="customerImpl")
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
   /* @Override
    public void saveOrCustomer(Customer customer) {
        this.customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> loginCustomer(Long customerId, String password) {
        return this.customerRepository.findById(customerId).filter(customer -> customer.getPassword().equals(password));
    }*/

    @Override
    public Optional<Customer> findCustomerById(Long customerId) {
        return this.customerRepository.findById(customerId);
    }
}
