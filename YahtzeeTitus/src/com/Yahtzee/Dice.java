package com.Yahtzee;

import java.util.Random;

public class Dice {
    private int value;
    private int faces = 6;

    public Dice() {
        value = 1;
    }

    public void roll(Random rand) {
        value = rand.nextInt(faces) + 1;
    }

    public int getDiceValue() {
        return value;
    }
}


