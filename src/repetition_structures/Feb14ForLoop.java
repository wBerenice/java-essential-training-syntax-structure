package repetition_structures;

import java.util.Scanner;

public class Feb14ForLoop {
    /*
    Write a cashier program that will scan a given number
    of items and tally the cost.
     */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items would you like to scan?");
        int counter = scanner.nextInt();
        int counter2 = counter;

        System.out.println("I will ask you " + counter + " times for the cost of your products");

        double totalCost = 0;

        for(int i = 0; i < counter; i++){
            System.out.println(counter2 + " remaining questions");
            System.out.println("Enter price");
            totalCost += scanner.nextDouble();
            System.out.println("The value of totalCost is currently " + totalCost);
            counter2--;
        }

    }//main

}//Feb14ForLoop
