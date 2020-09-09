package com.tenet;

public class CheckingAccount extends DebitAccount {
    public CheckingAccount(int pinNumber, int balance, String accountOwner) {
        super(pinNumber, "balance", balance, "Checking");
    }
}