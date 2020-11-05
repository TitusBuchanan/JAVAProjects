package com.Hotel;

import java.util.ArrayList;

public class Hotel {
    private int numberOfRooms;
    private ArrayList<Room> Rooms;

    public Hotel(int nrOfRooms, ArrayList<Room> rooms) {
        this.numberOfRooms = numberOfRooms;
        Rooms = rooms;
    }

    public int getNrOfRooms() {
        return numberOfRooms;
    }

    public void setNrOfRooms(int nrOfRooms) {
        this.numberOfRooms = nrOfRooms;
    }

    public void createRoom() {
        Room room = new Room();
        Rooms.add(room);
    }
}
