package com.elta.ironbank.eltaironbank;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import static com.elta.iron.bank.eltaironbankstarter.ProfilesConst.WINTER_IS_HERE;


/**
 * @author Evgeny Borisov
 */
@Service
@Profile(WINTER_IS_HERE)
public class SeverePredictionService implements PredictionService {



    @Override
    public boolean willSurvive(String name) {
        return name.toLowerCase().contains("lanister");
    }
}
