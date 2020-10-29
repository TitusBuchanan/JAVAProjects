package com.Kanb;

public class BankAccount {
    private int balance;
    private String owner;
    private String accountNum;
    private String type;

    public BankAccount(int balance, String accountNum, String owner, String type){
        this.balance = balance;
        this.owner = owner;
        this.accountNum = accountNum;
        this.type = type;
    }

    public void deposit(int amt) {
        if( amt > 0) {
            balance += amt;
        }
    }

    public void withdraw(int amt) {
        if(amt <= amt) {
            balance -= amt;
        }


    }

    @Override
    public String toString() {
        return "type: " + type + "\tAccountNumber: " + accountNum + "\tOwner: " + owner + "\tbalance: " + balance;
    }



}
