package objects;

public class March01HomeAreaCalculator {
//Exercise 01/March/2023

    public static void main(String[] args) {

        Rectangle emptyRoom = new Rectangle();
        emptyRoom.setWidth(25);
        emptyRoom.setLength(50);
        double areaOfRoom1 = emptyRoom.calculateArea();

        Rectangle room1 = new Rectangle(50,30);
        double areaOfRoom2 = room1.calculateArea();
    }



}//class March01HomeAreaCalculator
