package com.example.aspect.demo.repository;

import com.example.aspect.demo.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by keerthanadevi on Mar, 2019
 */

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
