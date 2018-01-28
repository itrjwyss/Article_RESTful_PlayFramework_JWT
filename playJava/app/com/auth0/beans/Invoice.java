package com.auth0.beans;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {

    private String name;

    private String address;

    private String idNumber;

    private String code;

    private LocalDate date;

    private BigDecimal amount;

    public Invoice(){

    }

    public Invoice(String name, String address, String idNumber, String code,
                   LocalDate date, BigDecimal amount){
        this.name = name;
        this.address = address;
        this.idNumber = idNumber;
        this.code = code;
        this.date = date;
        this.amount = amount;
    }

    private String getName(){
        return name;
    }

    private void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getIdNumber(){
        return idNumber;
    }

    public void setIdNumber(String idNumber){
        this.idNumber = idNumber;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public BigDecimal getAmount(){
        return amount;
    }

    public void setAmount(BigDecimal amount){
        this.amount = amount;
    }

}