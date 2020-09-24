package com.Yahtzee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand {
    private List<Dice> die;

    public Hand() {
        die = new ArrayList<Dice>();
        for(int diceCount = 0; diceCount < 5; diceCount++) {
            die.add(new Dice());
        }
    }

    public void diceRoll(Random rand) {
        for(var dice: die) {
            dice.roll(rand);
        }
    }

    public void roll(Random rand, int choice) {
        die.get(choice).roll(rand);
    }

    public int getDiceValue(int pos) {
        return die.get(pos).getDiceValue();
    }
}
