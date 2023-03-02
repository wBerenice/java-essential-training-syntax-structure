package repetition_structures;

import java.util.Scanner;

public class Feb17NestedLoops {

    public static void main(String[] args){
        //NESTED LOOPS

        //Initialize what we know
//        int numberOfStudents = 24;
        int numberOfStudents = 5;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        //1. Each iteration of this loop will focus on 1 student
        for(int i = 0; i < numberOfStudents; i++){
//            System.out.println(i);
            double total = 0;
            //Process a student's test scores
            for(int j = 0; j < numberOfTests; j++){
                System.out.println("Enter the score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total / numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }//for loop

        scanner.close();
    }//main

}//Feb17NestedLoops
