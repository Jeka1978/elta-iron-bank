package com.elta.ironbank.eltaironbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Period;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/api-iron-bank/")
public class IronBankController {


    @Autowired
    private BankService bankService;

    @GetMapping("loan/{name}/{amount}")
    public String loan(@PathVariable String name, @PathVariable int amount) {
        return bankService.loan(name,amount);
    }

}
