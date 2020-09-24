package com.Yahtzee;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Dice dice = new Dice();
        System.out.println(dice.getDiceValue());
        dice.roll(rand);
        System.out.println(dice.getDiceValue());
        dice.roll(rand);
        System.out.println(dice.getDiceValue());
        dice.roll(rand);
        System.out.println(dice.getDiceValue());
        dice.roll(rand);
        System.out.println(dice.getDiceValue());
        dice.roll(rand);
        System.out.println(dice.getDiceValue());
        dice.roll(rand);
        System.out.println(dice.getDiceValue());
        dice.roll(rand);
        System.out.println(dice.getDiceValue());
        dice.roll(rand);



    }
}
