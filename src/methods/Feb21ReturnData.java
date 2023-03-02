package methods;

import java.util.Scanner;

public class Feb21ReturnData {
    public static void main(String[] args){

        //Challenge
        /*
        -Write an "instant credit check" program that approves
        anyone who makes more than $25,000 and has a credit
        score of 700 or better. Reject all others
         */

        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary2 = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore2 = scanner.nextInt();
        scanner.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(salary2, creditScore2);
        notifyUser(qualified);

    }//main

    public static boolean isUserQualified(double salary, int creditScore){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if(salary > requiredSalary && creditScore >= requiredCreditScore){
            return true;
        }else{
            return false;
        }
    }//method isUserQualified

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You've been approved");
        }else{
            System.out.println("Sorry. You've been declined");
        }//else
    }//method notifyUser

}//Feb21ReturnData
