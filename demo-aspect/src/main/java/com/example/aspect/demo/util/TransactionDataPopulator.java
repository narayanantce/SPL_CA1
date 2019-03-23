package com.example.aspect.demo.util;

import java.util.Date;

import com.example.aspect.demo.entity.Transaction;
import com.example.aspect.demo.repository.TransactionRepository;
import org.joda.time.DateTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by keerthanadevi on Mar, 2019
 */


@Component
public class TransactionDataPopulator implements CommandLineRunner {
    private TransactionRepository transactionRepository;
    public TransactionDataPopulator(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        Transaction transaction = new Transaction();

        transaction.setAccount_Id("12312312");
        transaction.setCustomerId((long) 12312312);
        //transaction.setTransaction_id("123123-12312-123");
    	/*transaction.setTransaction_type("DEBIT");
    	transaction.setTransaction_code("ATMW");
    	transaction.setTransaction_Amount(9000.0);
    	transaction.setTransaction_category("Food");
    	transaction.setReward_JackPoint("12312");
    	transaction.setRemarks("21343242342342kdfjakdsljfsadklfj");
    	transaction.setBankAccount_From(12332423);
    	transaction.setBankAccount_To(12332423);*/
        transactionRepository.save(transaction) ;
    }
}

