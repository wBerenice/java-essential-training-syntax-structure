package objects;

import java.util.Random;
import java.util.Scanner;

public class HomeAreaCalculatorWithMethods {

    static Scanner scanner = new Scanner(System.in);
    //We can use objects as the arguments for methods as well
    public static void main(String[] args){
        Rectangle office = getRoom();
        Rectangle school = getRoom();

        double areaSchoolAndOffice = totalArea(office, school);
        System.out.println("The total area is: " + areaSchoolAndOffice);

        Rectangle kitchen = new Rectangle(200, 400);
        Rectangle bathroom = new Rectangle(300, 700);

        double area = totalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        scanner.close();
    }//main

    public static double totalArea(Rectangle room1, Rectangle room2){
        return room1.calculateArea() + room2.calculateArea();
    }

    public static Rectangle getRoom(){
        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();
        return new Rectangle(width, length);
    }


}//class HomeAreaCalculatorWithMethods
