package com.company;

public interface IntRoom {

    String getRoomName();
    int getSquare();
    int getWindowNum();
    int getTotalLightOfLamps();
    int getOccupiedSpace();
    String toString();

    void add(Chair chair);
    void add(Lamp lamp);
    void add(Table table);
}
