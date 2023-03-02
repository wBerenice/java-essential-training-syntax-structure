package decision_structures;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Feb09DollarGame {
    //Enter enough change to equal exactly one U.S. dollar
    //Ask the User to Provide
    // Example: 5, 10, 2, 1
    // 1. Pennies 1 cent
    //2. Nickels 5 cents
    //3. Dimes 10 cents
    //4. Quarters 25 cents

    //Calculate and Print
    // -Count total value of the coins
    //Print a message informing them if they won or lost
    //"More than one dollar, how much you went over"
    //"Less than one dollar, how you went under"


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Each penny is worth 1 cent.");
        System.out.println("Enter number of pennies");
        int userPennies = scanner.nextInt();

        System.out.println("Each nickel is worth 5 cents.");
        System.out.println("Enter number of nickels");
        int userNickels = scanner.nextInt();
        int userNickelsCents = userNickels * 5;

        System.out.println("Each dime is worth 10 cents.");
        System.out.println("Enter number of dimes");
        int userDimes = scanner.nextInt();
        int userDimesCents = userDimes * 10;

        System.out.println("Each quarter is worth 25 cents.");
        System.out.println("Enter number of quarters");
        int userQuarters = scanner.nextInt();
        int userQuartersCents = userQuarters * 25;

        int totalResult = userPennies + userNickelsCents + userDimesCents + userQuartersCents;

        int extraCents;
        if(totalResult > 100){
            extraCents = totalResult - 100;
        }else if(totalResult < 100){
            extraCents = 100 - totalResult;
        }else{
            extraCents = 0;
        }


        if(totalResult == 100){
            System.out.println("Congrats! That's exactly one dollar");
        }else if( totalResult > 100) {
            System.out.println("Fantastic. That's one dollar and " + extraCents + " extra cents");
        }else if(totalResult < 100){
            System.out.println("That was close! You were short " + extraCents + " to a U.S. dollar");
        }else{
            System.out.println("Something went wrong!");
        }


    }//main



}//class Feb09DollarGame
