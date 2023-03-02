package decision_structures;

import java.util.Scanner;
/*
SWITCH
Have a user enter their letter grade, and using a switch statement,
print out a message letting them know how they did.
 */
public class SwitchGradeMessage {
    public static void main(String[] args) {

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;
        //We are not passing a condition, we are passing a VARIABLE
        switch(grade){
            case "A":
                message = "Excellent job!";
                System.out.println(message);
                break;
            case "B":
                message = "Great job!";
                System.out.println(message);
                break;
            case "C":
                message = "Good job!";
                System.out.println(message);
                break;
            case "D":
                message = "You need to work a bit harder";
                System.out.println(message);
                break;
            case "F":
                message = "Uh oh!";
                System.out.println(message);
                break;
            default:
                message = "Something went wrong! Try again";
                System.out.println(message);
                break;
        }//switch

    }//main
}//class SwitchGradeMessage
