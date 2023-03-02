package repetition_structures;

import java.util.Scanner;

public class Feb14DoWhileLoop {
    public static void main (String[] args){
        /*
        1. Write a program that allows a user to enter two numbers and then sums the two numbers
        2. The user should be able to repeat this action until they indicate they are done
         */

        System.out.println("Enter two numbers, this program will sum them");
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Number 1");
//        int num1 = scanner.nextInt();
//        System.out.println("Number 2");
//        int num2 = scanner.nextInt();

        boolean moreQuestions = false;
        do{
            System.out.println("Number 1");
            int num1 = scanner.nextInt();
            System.out.println("Number 2");
            int num2 = scanner.nextInt();

            int result = num1 + num2;
            System.out.println("Result: " + result);
            System.out.println("Do you want to continue?");
            String userAnswer = scanner.next();
            if(userAnswer.equals("Yes")){
                moreQuestions = true;
            }else if(userAnswer.equals("No")){
                moreQuestions = false;
            }else{
                moreQuestions = false;
            }
        }while(moreQuestions);

    }//main
}//Feb14DoWhileLoop
