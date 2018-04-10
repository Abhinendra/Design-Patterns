package com.abhinendra.nullobject;

public class BankAccount {
    private int balance;
    private Log log;

    public BankAccount(int balance,Log log) {
        this.balance = balance;
        this.log=log;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addBalance(int amount){
        this.balance+=amount;
        log.info("Balance increased by "+amount);
    }
}
