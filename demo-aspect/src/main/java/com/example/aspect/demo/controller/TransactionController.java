package com.example.aspect.demo.controller;

import com.example.aspect.demo.entity.Transaction;
import com.example.aspect.demo.repository.AccountRepository;
import com.example.aspect.demo.repository.CustomerRepository;
import com.example.aspect.demo.repository.TransactionRepository;
import com.example.aspect.demo.service.AccountService;
import com.example.aspect.demo.service.CustomerService;
import com.example.aspect.demo.service.TransactionService;
import com.example.aspect.demo.service.impl.AccountServiceImpl;
import com.example.aspect.demo.service.impl.CustomerServiceImpl;
import com.example.aspect.demo.service.impl.TransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by keerthanadevi on Mar, 2019
 */

@Component
@RestController/*("/Transaction/")*/
public class TransactionController {

    @Autowired
    private TransactionController TransactionController;


    @Autowired
    @Qualifier("customerImpl")
    private CustomerService customerService;

    @Autowired
    private Transaction transaction;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    @Qualifier("transactionImpl")
    private TransactionService transactionService;
    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    @Qualifier("accountImpl")
    private AccountService accountService;
    @Autowired
    private AccountRepository accountRepository;

    @Bean
    public CustomerService getCustomerService() {
        return new CustomerServiceImpl(customerRepository);
    }

    @Bean
    public Transaction getTransaction() {
        return new Transaction();
    }


    @Bean
    public TransactionService getTransactionService() {
        return new TransactionServiceImpl(transactionRepository);
    }

    @Bean
    public AccountService getAccountService() {
        return new AccountServiceImpl(accountRepository);
    }

    @RequestMapping(value = "/processTransaction", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public  @ResponseBody Transaction processTransaction(@RequestBody Transaction transaction) {
        System.out.println("Account ID" +transaction.getAccount_Id());
        boolean isDone=false;
		/* if (errors.hasErrors()) {
	            return new ResponseEntity<>(new ErrorResponse(CREATE_TRANSACTION_ERROR.getId(), CREATE_TRANSACTION_ERROR.getMessage()), HttpStatus.BAD_REQUEST);
	        }
		*/ //Optional<Customer> customer = customerService.findCustomerById(transaction.getCustomer_Id());
        // if(customer!=null) {
        isDone = accountService.initateTransaction(transaction.getBankAccount_From(),transaction.getBankAccount_To(),transaction.getTransaction_Amount());

        if(isDone)
            transaction.setStatus("SUCCESS");
        else
            transaction.setStatus("FAILED");

        transactionService.saveTransaction(transaction);
        // }

        return transaction;
    }

}