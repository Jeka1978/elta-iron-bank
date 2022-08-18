package com.elta.ironbank.eltaironbank.services;

import com.elta.iron.bank.eltaironbankstarter.NotEnoughMoneyException;
import com.elta.ironbank.eltaironbank.Bank;
import com.elta.ironbank.eltaironbank.BankRepo;
import com.elta.ironbank.eltaironbank.PredictionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Evgeny Borisov
 */
@Service
@Transactional(isolation = Isolation.READ_UNCOMMITTED)
public class BankService {
    private final BankRepo bankRepo;

    private final PredictionService predictionService;

    public BankService(BankRepo bankRepo, PredictionService predictionService) {
        this.bankRepo = bankRepo;
        this.predictionService = predictionService;
    }

    public String loan(String name, int amount) {

        Bank bank = bankRepo.findAll().get(0);
        if (bank.getBalance() < amount) {
            throw new NotEnoughMoneyException("not enough money");
        }
        if (predictionService.willSurvive(name)) {
            bank.setBalance(bank.getBalance()-amount);
            return "loan accepted";
        } else {
            return "loan rejected, you will not survive the winter, or we just don't like you";
        }
    }
}










