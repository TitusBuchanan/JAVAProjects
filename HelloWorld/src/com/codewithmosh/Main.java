package com.codewithmosh;


import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Or operator
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;


        //Logical Operators
        //int temperature = 22;
        //boolean isWarm = temperature > 20 && temperature < 30;
        //System.out.println(isWarm);



        //comparison operators
        //int x = 1;
        //int y = 2;
        //System.out.println(x <= y);


        //Reading input
        //Scanner scanner = new Scanner(System.in);
        // System.out.print("Name: ");
       // String name = scanner.nextLine().trim();
       // System.out.println("You are " + name);

        //Formatting Numbers
       //NumberFormat percent = NumberFormat.getPercentInstance();
      // String result = percent.format(0.56);
      //  System.out.println(result);

        //Math
        //int result = (int)Math.round(Math.random() * 100) ;
        //System.out.println(result);


        //Implicit Casting
        //byte > short > int > long > float > double
        //String x = "1";
       // int y = Integer.parseInt(x) + 2;
        //System.out.println(y);

    }
}


