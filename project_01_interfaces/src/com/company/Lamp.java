package com.company;

public class Lamp implements IntLight_bulbs {

    private int lampLight;
    private String lampName;

    public Lamp(String lampName, int lampLight) {
        this.lampName = lampName;
        this.lampLight = lampLight;
    }

    public int getLampLight() {
        return lampLight;
    }
}
