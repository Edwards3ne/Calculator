package com.restapp.controller;

import com.restapp.service.CalculatorService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    CalculatorService calcService;
    private Logger logger = Logger.getLogger(CalculatorController.class);

    @PostMapping("/calculator/calculatorService/add")
    public String add(@RequestParam int intA, int intB) {
        int result=calcService.add(intA,intB);
        String hi="result="+result;
        logger.info(hi);
        return hi;
    }
    @PostMapping("/calculator/calculatorService/subtract")
    public String substract(@RequestParam int intA, int intB) {
        int result=calcService.subtract(intA,intB);
        String hi="result="+result;
        logger.info(hi);
        return hi;
    }
    @PostMapping("/calculator/calculatorService/divide")
    public String divide(@RequestParam int intA, int intB) {
        int result=calcService.divide(intA,intB);
        String hi="result="+result;
        logger.info(hi);
        return hi;
    }
    @PostMapping("/calculator/calculatorService/multiply")
    public String multiply(@RequestParam int intA, int intB) {
        int result=calcService.multiply(intA,intB);
        String hi="result="+result;
        logger.info(hi);
        return hi;
    }
}
