package repetition_structures;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Feb17NestedLoopsByMyself {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 5;
        int numberOfTests = 4;

        //Loop for Students
        for(int i = 0; i <numberOfStudents; i++){
            double total = 0;
            for(int j = 0; j < numberOfTests; j++){
                System.out.println("Enter the score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }//for loop for Tests
                double average = total / numberOfTests;
                System.out.println("The average for student #" + (i+1) + " is " + average);
        }//for loop 5 Students


        scanner.close();
    }//main


}//Feb17NestedLoopsByMyself
