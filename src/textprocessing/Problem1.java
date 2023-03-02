package textprocessing;

import java.util.Scanner;

public class Problem1 {
    /*
    Write a method that counts the number of words in
    a string and prints each one on a new line
     */

    public static void printingLines(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String userWord = scanner.nextLine();
        System.out.println(userWord);

        String[] userArrayWord = userWord.split(" ");
        System.out.println("There are " + userArrayWord.length + " words in your sentence");
        for(String x : userArrayWord){
            System.out.println(x);
        }

        scanner.close();
    }//method printingLines

    public static void main(String[] args){
        printingLines();
    }//main


}//class Problem1
