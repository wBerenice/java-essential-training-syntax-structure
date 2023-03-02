package games;

import java.util.Scanner;

public class FillBlanks {
    /*
    On a ADJECTIVE SEASON day, I drink a minimum
    of NUMBER cups of coffee.
    */
    public static void main(String[] args){

        String season = "";
        System.out.println("Type a SEASON");
        Scanner scanner = new Scanner(System.in);
        season = scanner.next();
        //String adjective = scanner.next();

        int coffeeCups = 0;
        System.out.println("How many cups of coffee do you drink?");
        coffeeCups = scanner.nextInt();

        String adjective = "";
        System.out.println("Type a random adjective");
        adjective = scanner.next();

        scanner.close();

        //Result
        System.out.println("On a "+ adjective + " " + season + " day, I drink a minimum of "+ coffeeCups + " cups of coffee");


    }
}//FillBlanks

