//package com.restapp.service;
//
//import com.restapp.enums.CalcOperation;
//import com.restapp.models.Calculation;
//import com.restapp.repository.AerospikeCalculationRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//@Service
//public class CalculationService {
//    AerospikeCalculationRepository aerospikeCalculationRepository;
//
//    public CalculationService(AerospikeCalculationRepository aerospikeCalculationRepository) {
//        this.aerospikeCalculationRepository = aerospikeCalculationRepository;
//    }
//
//    public Optional<Calculation> findCalcById(int id){
//        return aerospikeCalculationRepository.findById(id);
//    }
//    public void addCalc(Calculation record){
//        aerospikeCalculationRepository.save(record);
//    }
//    public void removeCalcById(int id){
//        aerospikeCalculationRepository.deleteById(id);
//    }
//    public List<Calculation> getAllCalc(){
//        return aerospikeCalculationRepository.findAll();
//    }
//    public void addComment(int id,String comment){
//        Optional<Calculation> calculation=aerospikeCalculationRepository.findById(id);
//        calculation.ifPresent(calculation1 -> calculation1.setComment(comment) );
//    }
//    public List<Calculation> getAllByMethod(String method){
//        CalcOperation operation;
//        switch (method.toLowerCase()){
//            case "multiply":
//                operation=CalcOperation.MULTIPLY;
//                break;
//            case "add":
//                operation=CalcOperation.ADD;
//                break;
//            case "divide":
//                operation=CalcOperation.DIVIDE;
//                break;
//            case "subtract":
//                operation=CalcOperation.SUBTRACT;
//                break;
//            default:
//                operation=null;
//                break;
//        }
//        return aerospikeCalculationRepository.findAllByMethod(operation);
//    }
//
//}
