package decision_structures;

import java.util.Scanner;

public class Feb09Switch {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your letter grade:");
        String grade = scanner.next();
        scanner.close();

        String message;

        switch(grade){
            case "A":
                System.out.println("Excellent!, you score was: "+ grade);
                message = "Score: " + grade;
                break;
            case "B":
                System.out.println("Good job!, you score was: " + grade);
                message = "Score: " + grade;
                break;
            default:
                System.out.println("Your score is bad :(");
                message = "Score: " + grade;
                break;
        }//switch

        System.out.println(message);
    }//main


}//class Feb09Switch
