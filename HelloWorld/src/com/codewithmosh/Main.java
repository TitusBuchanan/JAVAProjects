package com.codewithmosh;


import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      //FizzBuzz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();

        if ( number % 5 == 0 ) {
            if (number % 3 == 0)
            System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if( number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);





        //Switch Statements
       // int role = 1;

        //switch (role) {
           // case 1:
             //   System.out.println("You're a admin");
            //    break;
           // case 2:
               // System.out.println("You're a moderator");
               // break;

            //default:
               // System.out.println("You're a guest");

      //  }




        //The Ternary Operator
        //int income = 120_000;
        //String className = income > 100000 ? "First" : "Economy";


        //Simplyfying if Statements
        //int income = 120000;
        //boolean hasHighIncome = (income > 100000);



        //If statements
        //int temp = 11;
        //if (temp > 30) {
         //   System.out.println("It's a Hot Day");
        //    System.out.println("Drink Water");
        //} else if (temp > 20 && temp <= 30) {
        //    System.out.println("Beautiful Day");
       // } else {
       //     System.out.println("Cold Day");
       // }


        //Or operator
        //boolean hasHighIncome = true;
        //boolean hasGoodCredit = true;
        //boolean hasCriminalRecord = false;
        //boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;


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


