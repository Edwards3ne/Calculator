package com.restapp.controller;

import com.restapp.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    CalculatorService calcService;

    @PostMapping("/calculator/calculatorService/add")
    public int add(@RequestParam int intA, int intB) {
        return calcService.add(intA,intB);
    }
    @PostMapping("/calculator/calculatorService/subtract")
    public int subtract(@RequestParam int intA, int intB) {
        return calcService.subtract(intA,intB);
    }
    @PostMapping("/calculator/calculatorService/divide")
    public int divide(@RequestParam int intA, int intB) {
        return calcService.divide(intA,intB);
    }
    @PostMapping("/calculator/calculatorService/multiply")
    public int multiply(@RequestParam int intA, int intB) {
        return calcService.multiply(intA,intB);
    }
}
