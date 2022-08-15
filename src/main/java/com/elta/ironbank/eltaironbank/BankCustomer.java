package com.elta.ironbank.eltaironbank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "my_customer")
//@Entity(name = "ccc")
@Entity
public class BankCustomer {

    @Id
    @GeneratedValue
    private Long id;


    private String name;

    private int balance;
}




