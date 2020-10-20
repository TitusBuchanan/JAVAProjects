package com.Dungeon;

public class Die {

    private int value;

    public Die() {
        roll();
    }
    public void roll() {
        setValue((int)(Math.random() * 6) + 1);
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}

