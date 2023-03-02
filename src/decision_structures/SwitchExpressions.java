package decision_structures;

import java.util.Scanner;
/*
SWITCH EXPRESSIONS
-Directly assign a value to a variable
when a case is matched.
 */
public class SwitchExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your score?");
    String grade = scanner.next();
    scanner.close();

    String message = switch(grade){
        case "A", "B" -> "Excellent job!";
//        case "B" -> "Great job!";
        case "C" -> "Good job!";
        case "D" -> "You need to work a bit harder";
        case "F" ->"Uh oh!";
        default -> "Error. Invalid grade";
    };//switch

    }//main
}//SwitchExpressions
