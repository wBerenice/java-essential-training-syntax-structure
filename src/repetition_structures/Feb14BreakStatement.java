package repetition_structures;

import java.util.Scanner;

public class Feb14BreakStatement {

    /*
    BREAK STATEMENT
    -> Search a string to determine if it contains the letter 'A'
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text:");
        String text = scanner.next();

        boolean letterFound = false;

        //Search text for letter A
        for(int i = 0; i < text.length(); i++){
            char currentLetter = text.charAt(i); //current letter inside of the String
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }// for i loop


        scanner.close();
    }//main
}//Feb14BreakStatement
