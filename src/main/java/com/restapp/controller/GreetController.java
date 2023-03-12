package com.restapp.controller;


//import com.restapp.service.CalculatorService;
import com.restapp.service.CalculatorService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetController {
    @Autowired
    CalculatorService calcService;
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
