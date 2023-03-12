package com.restapp.repository;

import com.restapp.enums.CalcOperation;
import com.restapp.models.Calculation;
import org.springframework.data.aerospike.repository.AerospikeRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface AerospikeCalculationRepository extends AerospikeRepository<Calculation, Integer>, CrudRepository<Calculation, Integer> {
    List<Calculation> findAll();
    List<Calculation> findAllByMethod(CalcOperation method);

}
