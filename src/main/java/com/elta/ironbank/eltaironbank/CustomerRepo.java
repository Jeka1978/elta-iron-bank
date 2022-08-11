package com.elta.ironbank.eltaironbank;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface CustomerRepo extends JpaRepository<Customer,Long> {
    List<Customer> findByBalanceGreaterThan(int amount);
}
