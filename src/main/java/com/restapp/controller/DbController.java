package com.restapp.controller;

import com.restapp.enums.CalcOperation;
import com.restapp.models.Calculation;
import com.restapp.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
//@AllArgsConstructor
public class DbController {
    CalculationService service;
    RestTemplate restTemplate;
    Calculation calculation;

    public DbController(CalculationService service) {
        this.service = service;
        this.restTemplate=new RestTemplate();
    }
    @PostMapping("/calculate/add")
    public String callAdd(@RequestParam int intA, int intB) {
        String url = "http://localhost:8080/calculator/calculatorService/add?intA=" + intA + "&intB=" + intB;
        Integer resultAnswer = restTemplate.postForObject(url, null, Integer.class);
        if(resultAnswer!=null){
            service.createAndSave(intA,intB,resultAnswer,CalcOperation.ADD);
            return "ok";
        }else {
            return "error";
        }
    }
    @PostMapping("/calculate/subtract")
    public String callSubtract(@RequestParam int intA, int intB) {
        String url = "http://localhost:8080/calculator/calculatorService/add?intA=" + intA + "&intB=" + intB;
        String resultAnswer = restTemplate.postForObject(url, null, String.class);
        return resultAnswer;
    }
    @PostMapping("/calculate/multiply")
    public String callMultiply(@RequestParam int intA, int intB) {
        String url = "http://localhost:8080/calculator/calculatorService/add?intA=" + intA + "&intB=" + intB;
        String resultAnswer = restTemplate.postForObject(url, null, String.class);
        return resultAnswer;
    }
    @PostMapping("/calculate/divide")
    public String callDivide(@RequestParam int intA, int intB) {
        String url = "http://localhost:8080/calculator/calculatorService/add?intA=" + intA + "&intB=" + intB;
        String resultAnswer = restTemplate.postForObject(url, null, String.class);
        return resultAnswer;
    }
    @GetMapping("/results")
    public List<Calculation> getAll(){
        return service.getAllCalc();
    }
    @GetMapping("/results/{id}")
    public Optional<Calculation> getById(@PathVariable("id") Integer id){
        return service.findCalcById(id);
    }
    @DeleteMapping("/results/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        service.removeCalcById(id);
    }
    @PutMapping("/results/{id}")
    public void addCommentToId(@PathVariable("id")Integer id,String comment){
        service.addComment(id,comment);
    }
    @GetMapping("/results/operation/{method}")
    public List<Calculation> getAllByMethod(@PathVariable("method")String method){
        return service.getAllByMethod(method);
    }


}
