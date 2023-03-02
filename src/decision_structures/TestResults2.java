package decision_structures;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestResults2 {

    public static void main(String[] args) {

        //Get the test score
        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        //Determine the letter grade
        char grade;
        if(score < 60){
            grade = 'F';
            System.out.println(grade);
        }else if (score < 70){
            grade = 'D';
            System.out.println(grade);
        }else if(score < 80){
            grade = 'C';
            System.out.println(grade);
        }else if(score < 90){
            grade = 'B';
            System.out.println(grade);
        }else{
            grade = 'A';
            System.out.println(grade);
        }//else


    }
}
