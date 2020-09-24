package com.CliffYahtzee;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
       // Random rand = new Random();
       // Die die = new Die();
       // System.out.println(die.getValue());
       // die.roll(rand);
       // System.out.println(die.getValue());
       // die.roll(rand);
       // System.out.println(die.getValue());
       // die.roll(rand);
      //  System.out.println(die.getValue());
      //  die.roll(rand);

        Random rand = new Random();
        Hand myHand = new Hand();
        System.out.print(myHand.getDie(0));
        System.out.print(myHand.getDie(1));
        System.out.print(myHand.getDie(3));
        myHand.roll(rand);
        System.out.print(myHand.getDie(0));
        System.out.print(myHand.getDie(1));
        System.out.print(myHand.getDie(3));
        myHand.roll(rand);
        System.out.print(myHand.getDie(0));
        System.out.print(myHand.getDie(1));
        System.out.print(myHand.getDie(3));
        myHand.roll(rand);
        myHand.roll();


    }
}
