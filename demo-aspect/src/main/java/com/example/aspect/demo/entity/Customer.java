package com.example.aspect.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by keerthanadevi on Mar, 2019
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Component
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private Date dateOfBirth;
    private String documentId;
    private String phoneNumber;
    private String email;
    private String incomeRange;
    private String occupation;
    private String residentialAddress;
    private String communicationAddress;
    private Integer age;
    private Boolean isMale;
    private Boolean isSingle;
    private String password;
    private Long rewardsPoints;

}

