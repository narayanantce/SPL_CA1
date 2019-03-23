package com.example.aspect.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Created by keerthanadevi on Mar, 2019
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Component
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String transaction_id;

    private String account_Id;
    private Long customerId;
    private String transaction_type;

    private String transaction_code;
    private double transaction_Amount;

    private String transaction_category;
    private Date creation_date;

    private String reward_JackPoint;
    private String bankAccount_From;
    private String bankAccount_To;
    private String remarks;
    private String status;
}
