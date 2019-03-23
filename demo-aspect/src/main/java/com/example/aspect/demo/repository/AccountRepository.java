package com.example.aspect.demo.repository;

import com.example.aspect.demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by keerthanadevi on Mar, 2019
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query(value = "Select * from ACCOUNT where CUSTOMERID =?1", nativeQuery = true)
    Account fineAccountByCustomerID(Long customerID);

    @Query(value = "Select * from ACCOUNT where ACCOUNTNUMBER =?1", nativeQuery = true)
    Account findByAccountNumber(String accountNumber);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "update ACCOUNT set AVAILABLEBALANCE=?1 where ACCOUNTNUMBER =?2",nativeQuery = true)
    int updateAccount(double currentBalance, String accountNumber);

}

