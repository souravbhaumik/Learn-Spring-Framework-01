package com.sourav.Exercise1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BuisnessCalculationService {

    private DataBaseService dataBaseService;

    public BuisnessCalculationService(DataBaseService dataBaseService) {
        super();
        this.dataBaseService = dataBaseService;
    }

    public int findMax() {
        return Arrays.stream(dataBaseService.retrieveData()).max().orElse(0);
    }

}
