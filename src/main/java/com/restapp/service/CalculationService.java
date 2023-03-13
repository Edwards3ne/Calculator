package com.restapp.service;

import com.restapp.enums.CalcOperation;
import com.restapp.exception.InvalidOperationException;
import com.restapp.exception.RecordNotFoundException;
import com.restapp.models.Calculation;
import com.restapp.repository.AerospikeCalculationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
//@AllArgsConstructor
public class CalculationService {
    AerospikeCalculationRepository aerospikeCalculationRepository;

    public CalculationService(AerospikeCalculationRepository aerospikeCalculationRepository) {
        this.aerospikeCalculationRepository = aerospikeCalculationRepository;
    }

    public Calculation getCalcById(int id){
        return aerospikeCalculationRepository.getById(id);
    }
    public void addCalc(Calculation record){
        aerospikeCalculationRepository.save(record);
    }
    public void removeCalcById(int id){
        aerospikeCalculationRepository.deleteById(id);
    }
    public List<Calculation> getAllCalc(){
        return aerospikeCalculationRepository.findAll();
    }
    public void addComment(int id,String comment) throws RecordNotFoundException {
        Calculation calculation=aerospikeCalculationRepository.getById(id);
        if(calculation!=null){
            calculation.setComment(comment);
            aerospikeCalculationRepository.save(calculation);
        }else {
            throw new RecordNotFoundException();
        }
    }
    public List<Calculation> getAllByOperation(String Operation) {
        return aerospikeCalculationRepository.findAllByOperation(Operation);
    }
    public void createAndSave(int a,int b,int result,String operation){
        aerospikeCalculationRepository.save(new Calculation(a,b,result,operation));
    }

}
