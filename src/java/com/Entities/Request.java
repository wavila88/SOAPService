/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Entities;

/**
 *
 * @author Usuario
 */
public class Request {
    private String id;
    private String name;
    private String date;
    private String PaymentValue;
    private String Bank;
    private String Country;
    private String fileName;

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
      
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPaymentValue() {
        return PaymentValue;
    }

    public void setPaymentValue(String PaymentValue) {
        this.PaymentValue = PaymentValue;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String Bank) {
        this.Bank = Bank;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    
    
}
