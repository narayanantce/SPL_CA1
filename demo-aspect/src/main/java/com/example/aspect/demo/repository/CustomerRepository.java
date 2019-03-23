package com.example.aspect.demo.repository;

import com.example.aspect.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by keerthanadevi on Mar, 2019
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
