package com.Yahtzee;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Hand titusHand = new Hand();

        System.out.print(titusHand.getDiceValue(2) + " ");
        System.out.print(titusHand.getDiceValue(3) + " ");
        System.out.print(titusHand.getDiceValue(3) + " ");
        System.out.print("\n");
        titusHand.diceRoll(rand);
        System.out.print(titusHand.getDiceValue(0) + " ");
        System.out.print(titusHand.getDiceValue(1) + " ");
        System.out.print(titusHand.getDiceValue(2) + " ");
        System.out.print("\n");
        titusHand.roll(rand,2);
        titusHand.roll(rand,1);




    }
}
