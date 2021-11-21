package com.digits.nosto.service;

import com.digits.nosto.model.NumberModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class NumberServiceTest {
    private final NumberService numberService;

    @Autowired
    public NumberServiceTest(NumberService numberService) {
        this.numberService = numberService;
    }

    @Test
     void getBigNumber() {
        NumberModel response = numberService.getBigNumber("13");
        String result = response.getNumber();
        assertEquals("31", result);
    }

    @Test
    void notGetNumber() {
        NumberModel response = numberService.getBigNumber("7777");
        String result = response.getNumber();
        assertEquals("No answer", result);
    }
}