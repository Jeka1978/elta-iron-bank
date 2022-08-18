package com.elta.ironbank.eltaironbank;

import com.elta.iron.bank.eltaironbankstarter.ProfilesConst;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import static com.elta.iron.bank.eltaironbankstarter.ProfilesConst.WINTER_IS_COMING;

/**
 * @author Evgeny Borisov
 */
@Service
@Profile(WINTER_IS_COMING)
public class PredictionServiceImpl implements PredictionService {
    @Override
    public boolean willSurvive(String name) {
        return !name.toLowerCase().contains("stark");
    }
}
