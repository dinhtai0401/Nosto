package com.digits.nosto.controller;

import com.digits.nosto.model.NumberModel;
import com.digits.nosto.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.digits.nosto.configuration.GlobalProperties.API_PREFIX;

@Controller
@RequestMapping(API_PREFIX + "/big-number")
public class NumberController {

    private final NumberService numberService;

    @Autowired
    public NumberController(NumberService numberService) {
        this.numberService = numberService;
    }

    @ResponseBody
    @GetMapping("/{number}")
    public NumberModel getBigNumber(@PathVariable String number) {
        return numberService.getBigNumber(number);
    }
}
