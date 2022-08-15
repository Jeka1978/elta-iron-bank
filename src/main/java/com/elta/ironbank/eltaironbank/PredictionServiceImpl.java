package com.elta.ironbank.eltaironbank;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class PredictionServiceImpl implements PredictionService {
    @Override
    public boolean willSurvive(String name) {
        return !name.toLowerCase().contains("stark");
    }
}
