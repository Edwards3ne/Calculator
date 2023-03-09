package com.restapp.controller;


import com.restapp.service.CalculatorService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;


@RestController
public class GreetController {
    CalculatorService calcService=new CalculatorService();
    private Logger logger = Logger.getLogger(GreetController.class);

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        String greet = "Hello!!! " + name + " How are You?";
        logger.info(greet);
        return greet;
    }
    @PostMapping("/send")
    public String send(@RequestParam int intA,int intB) {

        int result=calcService.add(intA,intB);
        String hi="result="+result;
        logger.info(hi);
        return hi;
    }

}
