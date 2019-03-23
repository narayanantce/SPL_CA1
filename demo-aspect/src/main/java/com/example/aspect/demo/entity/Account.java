package com.example.aspect.demo.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * Created by keerthanadevi on Mar, 2019
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity(name = "Account")
@Table(name = "ACCOUNT")
public class Account implements Serializable {

    private static final long serialVersionUID = -7427768039678380765L;

    @Id
    @Basic(optional = false)
    @Column(name = "ACCOUNTNUMBER", nullable = false)
    private String accountNumber;

    @Basic(optional = false)
    @Column(name = "CUSTOMERID", nullable = false)
    private long customerID;

    @Basic(optional = true)
    @Column(name = "ACCOUNTNAME", nullable = true)
    private String accountName;

    @Basic(optional = false)
    @Column(name = "ACCOUNTTYPE", nullable = false)
    private String accountType;

    @Basic(optional = false)
    @Column(name = "AVAILABLEBALANCE", nullable = false)
    private double availableBalance;
}
