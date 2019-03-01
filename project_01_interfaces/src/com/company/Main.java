package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Building building = new Building("Здание 1");
        Room room1 = new Room("Комната 1", 100, 3);
        Room room2 = new Room("Комната 2", 50, 2);

        building.addRoom(room1);
        building.addRoom(room2);
        building.getRoom("Комната 1").add(new Table("Стол письменный",50));
        building.getRoom("Комната 1").add(new Chair("Кресло мягкое и пушистое",1,2));
        building.getRoom("Комната 1").add(new Lamp("Лампочка",150));
        building.getRoom("Комната 1").add(new Lamp("Лампочка",250));

        building.getRoom("Комната 2").add(new Table("Стол письменный",500));
        building.getRoom("Комната 2").add(new Chair("Кресло мягкое и пушистое",3,2));
        building.getRoom("Комната 2").add(new Lamp("Лампочка",150));
        building.getRoom("Комната 2").add(new Lamp("Лампочка",250));

        building.describe();




    }
}
