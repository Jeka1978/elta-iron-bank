package com.elta.ironbank.eltaironbank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface CustomerRepo extends JpaRepository<BankCustomer,Long> {

}
