//package com.restapp.controller;
//
//import com.restapp.models.Calculation;
//import com.restapp.service.CalculationService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class DbController {
//    CalculationService service;
//
//    public DbController(CalculationService service) {
//        this.service = service;
//    }
//    @GetMapping("/results")
//    public List<Calculation> getAll(){
//        return service.getAllCalc();
//    }
//
//    @GetMapping("/results/{id}")
//    public Optional<Calculation> getById(@PathVariable("id") Integer id){
//        return service.findCalcById(id);
//    }
//    @DeleteMapping("/results/{id}")
//    public void deleteById(@PathVariable("id")Integer id){
//        service.removeCalcById(id);
//    }
//    @PutMapping("/results/{id}")
//    public void addCommentToId(@PathVariable("id")Integer id,String comment){
//        service.addComment(id,comment);
//    }
//    @GetMapping("/results/operation/{method}")
//    public List<Calculation> getAllByMethod(@PathVariable("method")String method){
//        return service.getAllByMethod(method);
//    }
//
//
//}
