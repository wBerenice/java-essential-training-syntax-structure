package decision_structures;

import java.util.Scanner;

public class Feb09SwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade:");
        String grade = scanner.next();

        String message = switch(grade){
            case "A", "a" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade!";
        };

        System.out.println(message);

        float num1 = 2;
        float num2 = 8;
        System.out.println("Enter + or -");
        String operation = scanner.next();
        float result = switch(operation){
            case "+" -> {
                System.out.println("Adding...");
                yield num1 + num2;
            }
            case "-" -> {
                System.out.println("Subtracting...");
                yield num1 - num2;
            }
            default -> 0;
        };//switch

        System.out.println(result);

        scanner.close();
    }//main

}//class Feb09SwitchExpression
