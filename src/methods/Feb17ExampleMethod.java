package methods;

import java.util.Scanner;

public class Feb17ExampleMethod {
/*
    All methods must be contained within the scope of a class
 */
    public static void main(String[] args){
        calculateSum(5,6);
        printUserName();
    }//main

    //METHODS
    public static int calculateSum(int num1, int num2){
        int result = num1 + num2;
        System.out.println("The result is: "+ result);
        return result;
    }

    public static void printUserName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What's you name?");
        String name = scanner.next();
        System.out.println("Hello " + name + ", nice to meet you!");
    }//method printUserName

}//Feb17ExampleMethod
