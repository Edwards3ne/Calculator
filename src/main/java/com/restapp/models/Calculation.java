package com.restapp.models;

import com.restapp.enums.CalcOperation;
import org.springframework.data.aerospike.mapping.Document;
import org.springframework.data.annotation.Id;

import java.util.concurrent.atomic.AtomicInteger;

@Document
//@Data
public class Calculation {
    @Id
    private int id;
    private Integer numA;
    private Integer numB;
    private Integer result;
    private String comment;
    private static final AtomicInteger count = new AtomicInteger(0);

    private String operation;

    public Calculation(int id, Integer numA, Integer numB, Integer result, String comment, String operation) {
        this.id = id;
        this.numA = numA;
        this.numB = numB;
        this.result = result;
        this.comment = comment;
        this.operation = operation;
    }

    public Calculation() {
    }

    public Calculation(Integer numA, Integer numB, Integer result, String operation) {
        this.numA = numA;
        this.numB = numB;
        this.result = result;
        this.operation = operation;
        this.id=count.incrementAndGet();
    }

    public Calculation(Integer numA, Integer numB, String operation) {
        this.numA = numA;
        this.numB = numB;
        this.operation = operation;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getNumA() {
        return numA;
    }

    public void setNumA(Integer numA) {
        this.numA = numA;
    }

    public Integer getNumB() {
        return numB;
    }

    public void setNumB(Integer numB) {
        this.numB = numB;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMethod() {
        return operation;
    }

    public void setMethod(String method) {
        this.operation = method;
    }
}
