package com.tenet;

public class BankAccount {
    private int accountNum;
    private String owner;
    protected int balance;
    private String type;

    public BankAccount(int accountNum, int balance, String owner, String type){  //Constructor
        this.accountNum = accountNum;
        this.balance = balance;
        this.owner = owner;
        this.type = type;
    }

    public void deposit(int amt) {
        balance += amt;
    }

    public void withdraw(int amt) {
        balance -= amt;
    }

    public String getDetails() {
        return type + " Account, Owner: " + owner + "\tAccount Number: " + accountNum + "\tBalance: " + balance;
    }
}


