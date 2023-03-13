package com.restapp.exception;

public class RecordNotFoundException extends Exception{
    public RecordNotFoundException(String message) {
        super(message);
    }

    public RecordNotFoundException() {
        super("Record not found");
    }
}
