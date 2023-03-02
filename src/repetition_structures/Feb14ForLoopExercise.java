package repetition_structures;

import java.util.Scanner;

public class Feb14ForLoopExercise {
    public static void main (String[] args){
        /*
        Write a cashier program that will scan a given number of itenms and tally the cost
         */

        //Get number of items to scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items you would like to scan:");
        int quantity = scanner.nextInt();
        double total = 0;

        //Create a loop to iterate through all the items and accumulate the costs
        for(int i = 0; i < quantity; i++){
            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total += price;

        }//for loop

        scanner.close();
        System.out.println("Your total is $" + total);

    }//main

}//Feb14ForLoopExercise
