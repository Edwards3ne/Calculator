package com.restapp.controller;

import com.restapp.config.Properties;
import com.restapp.enums.CalcOperation;
import com.restapp.exception.CalculatorServiceException;
import com.restapp.service.CalculationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class MainController {
    CalculationService service;
    RestTemplate restTemplate;
    public MainController(CalculationService service) {
        this.service = service;
        this.restTemplate=new RestTemplate();
    }
    @PostMapping("/calculate/add")
    public String callAdd(@RequestParam int intA, int intB) throws CalculatorServiceException {
        String url = "http://localhost:8080/calculator/calculatorService/add?intA=" + intA + "&intB=" + intB;
        Integer resultAnswer = restTemplate.postForObject(url, null, Integer.class);
        if(resultAnswer!=null){
            service.createAndSave(intA,intB,resultAnswer, Properties.ADD_OPERATION);
            return "ok";
        }else {
            throw new CalculatorServiceException();
        }
    }
    @PostMapping("/calculate/subtract")
    public String callSubtract(@RequestParam int intA, int intB) throws CalculatorServiceException {
        String url = "http://localhost:8080/calculator/calculatorService/subtract?intA=" + intA + "&intB=" + intB;
        Integer resultAnswer = restTemplate.postForObject(url, null, Integer.class);
        if(resultAnswer!=null){
            service.createAndSave(intA,intB,resultAnswer, Properties.SUBTRACT_OPERATION);
            return "ok";
        }else {
            throw new CalculatorServiceException();
        }
    }
    @PostMapping("/calculate/multiply")
    public String callMultiply(@RequestParam int intA, int intB) throws CalculatorServiceException {
        String url = "http://localhost:8080/calculator/calculatorService/multiply?intA=" + intA + "&intB=" + intB;
        Integer resultAnswer = restTemplate.postForObject(url, null, Integer.class);
        if(resultAnswer!=null){
            service.createAndSave(intA,intB,resultAnswer, Properties.MULTIPLY_OPERATION);
            return "ok";
        }else {
            throw new CalculatorServiceException();
        }
    }
    @PostMapping("/calculate/divide")
    public String callDivide(@RequestParam int intA, int intB) throws CalculatorServiceException {
        String url = "http://localhost:8080/calculator/calculatorService/divide?intA=" + intA + "&intB=" + intB;
        Integer resultAnswer = restTemplate.postForObject(url, null, Integer.class);
        if(resultAnswer!=null){
            service.createAndSave(intA,intB,resultAnswer, Properties.DIVIDE_OPERATION);
            return "ok";
        }else {
            throw new CalculatorServiceException();
        }
    }

}
