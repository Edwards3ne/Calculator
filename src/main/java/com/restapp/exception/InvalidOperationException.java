package com.restapp.exception;

public class InvalidOperationException extends Exception{
    public InvalidOperationException(String message) {
        super(message);
    }

    public InvalidOperationException() {
        super("Invalid operation");
    }
}
