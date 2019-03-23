package com.example.aspect.demo.service;

import com.example.aspect.demo.entity.Account;
import java.util.Optional;

/**
 * Created by keerthanadevi on Mar, 2019
 */

public interface AccountService {

    public boolean creditAccount(String accountNumber, double amount);

    boolean debitAccount(String accountNumber, double amount);

    Optional<Account> findAccount(long customerID);

    boolean initateTransaction(String bankAccount_from, String bankAccount_to, double transaction_amount);

    int updateNewBalance(double currentBalance, String accountNumber);

}
