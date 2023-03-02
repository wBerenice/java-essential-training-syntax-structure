package repetition_structures;

import java.util.Scanner;

public class Feb14NestedLoopOriginal {
    /*
    NESTED LOOPS:
    Find the average of each student's test scores
     */
    public static void main(String[] args){

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        //Each iteration of the loop will focus on 1 student  0-23
        for(int i =0; i < numberOfStudents; i++){
            double total = 0;

            //Process a student's test scores
            for(int j = 0; j < numberOfTests; j++){
                System.out.println("Enter teh score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total += score;
            }//for j loop

            double average = total/numberOfTests;
            System.out.println("The test average for student #"+ (i+1) + " is " + average);
        }//for i loop



        scanner.close();
    }//main

}//Feb14NestedLoopOriginal
