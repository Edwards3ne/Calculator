package com.restapp.service;

import org.springframework.stereotype.Service;
import org.tempuri.CalculatorSoap;
@Service
public class CalculatorService implements CalculatorSoap {
    public CalculatorService() {
    }

    @Override
    public int subtract(int intA, int intB) {
        return intA-intB;
    }

    @Override
    public int divide(int intA, int intB) {
        return intA/intB;
    }

    @Override
    public int add(int intA, int intB) {
        return intA+intB;
    }

    @Override
    public int multiply(int intA, int intB) {
        return intA*intB;
    }
}
