package com.digits.nosto.controller;

import com.digits.nosto.model.MathModel;
import com.digits.nosto.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/api/v1")
public class MathController {
    private final MathService mathService;

    @Autowired
    public MathController(MathService mathService){
        this.mathService = mathService;
    }

    @ResponseBody
    @GetMapping("/{number}")
    public MathModel getBiggerNumber(@PathVariable String number) {
        return mathService.GetBiggerNumberService(number);
    }
}
