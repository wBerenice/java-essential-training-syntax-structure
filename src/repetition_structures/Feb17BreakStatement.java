package repetition_structures;

import java.util.Scanner;

public class Feb17BreakStatement {

    public static void main(String[] args) {
    //Get text
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text");
        String text = scanner.next();

        boolean letterFound = false;
        for(int i=0; i < text.length(); i++){
            char currentLetter = text.charAt(i);
            System.out.println(currentLetter);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }//for




    scanner.close();
    }//main

}//Feb17BreakStatement
