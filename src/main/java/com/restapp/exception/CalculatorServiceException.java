package com.restapp.exception;

public class CalculatorServiceException extends Exception{
    public CalculatorServiceException(String message) {
        super(message);
    }

    public CalculatorServiceException() {
        super("Calculator service not respond");
    }
}
