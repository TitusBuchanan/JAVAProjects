package com.tenet;

public class InvestmentAccount extends BankAccount {
    private int investment;


    public InvestmentAccount(int accountNum, int balance, String owner, int investment) {
        super(accountNum, balance, owner, "Investment");
    }

    public void acrueInvestment() {

    }
}
