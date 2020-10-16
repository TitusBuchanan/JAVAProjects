package com.Dunegeon;

public class Player {
    private int health;
    private String name;
    private int defense;

    public Player(int health, String name){
        this.health = health;
        this.name = name;

    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
