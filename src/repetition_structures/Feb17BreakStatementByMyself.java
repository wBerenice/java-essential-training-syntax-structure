package repetition_structures;

import java.util.Scanner;

public class Feb17BreakStatementByMyself {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Enter some text
        System.out.println("Enter some text now!");
        String newText = scanner.next();

        boolean letterFound = false;

        for(int i =0; i < newText.length(); i++){
            char currentCharNew = newText.charAt(i);
            System.out.println(currentCharNew);
            if(currentCharNew == 'A' || currentCharNew == 'a'){
                letterFound = true;
                break;
            }
        }//for loop

        scanner.close();
    }//main

}//Feb17BreakStatementByMyself
