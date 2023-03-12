package com.restapp.repository;

import com.restapp.enums.CalcOperation;
import com.restapp.models.Calculation;
import org.springframework.data.aerospike.repository.AerospikeRepository;

import java.util.List;

public interface AerospikeCalculationRepository extends AerospikeRepository<Calculation, Integer> {
    List<Calculation> findAll();
    List<Calculation> findAllByMethod(CalcOperation method);

}
