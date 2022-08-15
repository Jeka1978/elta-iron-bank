package com.elta.ironbank.eltaironbank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Evgeny Borisov
 */
public interface BankRepo extends JpaRepository<Bank,Integer> {
}
