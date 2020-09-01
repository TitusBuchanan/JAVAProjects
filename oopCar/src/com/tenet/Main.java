package com.tenet;

public class Main {

    public static void main(String[] args) {



	Car car = new Car(2,4,"Yellow","Lambo",350000);
	Car bugatti = new Car(2,4,"Black","Bugatti",2000000);



	System.out.println("This Car has "+ car.getWheels() + "WHeels");
		System.out.println("This Car has "+ car.getDoors() +" Doors");
		System.out.println("This Car's color is  "+ car.getColor() );
		System.out.println("This Car's Make is a  "+ car.getMake() );


		System.out.println("This Car has "+ bugatti.getWheels() + "WHeels");
		System.out.println("This Car has "+ bugatti.getDoors() +" Doors");
		System.out.println("This Car's color is  "+ bugatti.getColor() );
		System.out.println("This Car's Make is a  "+ bugatti.getMake() );




    }


}
