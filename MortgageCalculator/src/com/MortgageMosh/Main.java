package com.MortgageMosh;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int principal = (int) readNumber("Principal",1000,1000000);
       float annualInterest = (float) readNumber("Annual Intrest Rate: ", 1,30);
       byte years = (byte) readNumber("Period (Years)",1,30);


        double mortgage = calculateMortgage(principal,annualInterest,years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);


    }

    public static  double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if(value >= min && value <= max)
                break;
            System.out.println("Enter a value between 1" + min + " and " + max);

        }
        return value;
    }

    public static double calculateBalance(int principal, float annualInterest, byte years, short numberOfPaymentsMade) {


        float  monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float  numberOfPayments = years * MONTHS_IN_YEAR;

        double balance = principal * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest,numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest,numberOfPayments) - 1);

        return balance;
    }

    public static double calculateMortgage(int principal, float annualInterest, byte years){

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float  monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float  numberOfPayments = years * MONTHS_IN_YEAR;

       double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

       return  mortgage;
    }
}
