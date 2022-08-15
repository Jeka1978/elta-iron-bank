package com.elta.ironbank.eltaironbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Evgeny Borisov
 */
@Service
@Transactional
public class DBFillerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private BankRepo bankRepo;

    @PersistenceContext
    private EntityManager entityManager;

    @EventListener(ContextRefreshedEvent.class)
    public void fillDB(){
        Bank bank = Bank.builder().balance(100).build();
        bankRepo.save(bank);
        customerRepo.save(BankCustomer.builder().balance(10).name("Nedd Stark").build());
        customerRepo.save(BankCustomer.builder().balance(15).name("John Stark").build());
        customerRepo.save(BankCustomer.builder().balance(17).name("Robb Stark").build());
    }

}




