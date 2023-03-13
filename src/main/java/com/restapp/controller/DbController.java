package com.restapp.controller;

import com.restapp.enums.CalcOperation;
import com.restapp.exception.InvalidOperationException;
import com.restapp.exception.RecordNotFoundException;
import com.restapp.models.Calculation;
import com.restapp.service.CalculationService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DbController {
    CalculationService service;
    RestTemplate restTemplate;
    Calculation calculation;

    public DbController(CalculationService service) {
        this.service = service;
        this.restTemplate=new RestTemplate();
    }

    @GetMapping("/results")
    public List<Calculation> getAll(){
        return service.getAllCalc();
    }
    @GetMapping("/results/{id}")
    public Calculation getById(@PathVariable("id") Integer id){
        return service.getCalcById(id);
    }
    @DeleteMapping("/results/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        service.removeCalcById(id);
    }
    @PutMapping("/results/{id}")
    public void addCommentToId(@PathVariable("id")Integer id,String comment) throws RecordNotFoundException {
        service.addComment(id,comment);
    }
    @GetMapping("/results/operation/{method}")
    public List<Calculation> getAllByMethod(@PathVariable("method")String method) throws InvalidOperationException {
        return service.getAllByOperation(method);
    }


}
