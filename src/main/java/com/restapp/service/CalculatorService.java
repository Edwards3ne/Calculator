package com.restapp.service;

import org.tempuri.CalculatorSoap;

public class CalculatorService implements CalculatorSoap {

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
