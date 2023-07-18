package com.atm.atmapp.atm;

public class ATM {
    private String id;
    private String name;
    private String accountNumber;
    private int balance;

    
    public ATM() {

    }

    public ATM(String id, String name, String accountNumber, int balance) {
        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
}
