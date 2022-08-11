package com.elta.ironbank.eltaironbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Evgeny Borisov
 */
@Service
@Transactional
public class DBFillerService {

    @Autowired
    private CustomerRepo customerRepo;

    @EventListener(ContextRefreshedEvent.class)
    public void fillDB(){
        customerRepo.save(Customer.builder().balance(10).name("Nedd Stark").build());
        customerRepo.save(Customer.builder().balance(15).name("John Stark").build());
        customerRepo.save(Customer.builder().balance(17).name("Robb Stark").build());
    }
}




