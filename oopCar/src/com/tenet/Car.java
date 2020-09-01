package com.tenet;

public class Car {
   private int doors; //Attributes
    private int wheels;
    private String color;
    private String make;
    private int price;



    public Car(int doors, int wheels, String color, String make, int price) {
        this.doors = doors;
        this.wheels = wheels;
        this.make = make;
        this.color = color;
        this.price = price;
    }

    public int getDoors() {   //Methods(Getters) function inside of a class
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public int getPrice(){
        return price;
    }
}
