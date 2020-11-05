package com.Hotel;

import java.util.ArrayList;

public class Hotel {
    private int numberOfRooms;
    private ArrayList<Room> Rooms;
    int roomNum = 0;

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

    public void bookRoom(int roomNum)
    {
        if(rooms[roomNum].isEmpty() == false)
        {
            rooms[roomNum].setEmpty(false);
        }
        else
            System.out.println("Room " + roomNum + " is Already Occupied.");
    }
}
