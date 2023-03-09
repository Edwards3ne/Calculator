package com.restapp.controller;

import com.restapp.service.CalculatorService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    CalculatorService calcService=new CalculatorService();
    private Logger logger = Logger.getLogger(CalculatorController.class);

    @PostMapping("calculator/calculatorService")
    public String send(@RequestParam int intA, int intB) {

        int result=calcService.add(intA,intB);
        String hi="result="+result;
        logger.info(hi);
        return hi;
    }
}
