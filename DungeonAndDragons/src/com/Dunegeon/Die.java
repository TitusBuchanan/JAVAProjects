package com.Dunegeon;

import java.util.Random;

public class Die {
    private int sides;
    private static int value;
    private Random random = new Random();

    public Die(){
        sides = 6;
        value = 1;

    }

    public Die(int sides, int value) {
        this.sides = sides;
        this.value = value;
    }

    public int hand(){
        this.value= this.random.nextInt(sides) + 1;
        return value;
    }

    public int getSides(){
        return sides;
    }
    public static int getValue(){
        return value;
    }

}
