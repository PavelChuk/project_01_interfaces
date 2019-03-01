package com.company;

import java.util.ArrayList;
import java.util.List;

public class Building implements IntBuilding {
    protected static String name;
    public Building(String name) {
        Building.name = name;
    }
    private List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public Room getRoom(String roomName){
        List<Room> rooms = getRooms();
        Room myRoom = null;
            for (Room room : rooms) {
                if (room.getRoomName() == roomName) {
                    myRoom = room;
                    return myRoom;
                }
            }
            System.out.println("Такой комнаты не существует");
        return myRoom;
    }

    public void describe() {
        System.out.println(getName());
        for(Room room : rooms){
            System.out.println(room.toString());
        }
    }
}
