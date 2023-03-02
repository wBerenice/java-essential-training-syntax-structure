package textprocessing;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2Backwards {

    /*
    Write a method that prints a given string backward.
    For example, if given stop, it prints pots
     */
    public static void main(String[] args){
            textBackwards();
    }//main

    public static void textBackwards(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text");
        String word = scanner.nextLine();
        String[] arrayWord = word.split("");
        System.out.println(arrayWord.length);
                //8

        String[] reversedWord = new String[arrayWord.length];
        for(int i =arrayWord.length-1; i >= 0; i--){
            System.out.print(arrayWord[i]);
            for(int j =0; j < arrayWord.length; j++){
                reversedWord[j] = arrayWord[i];
            }
        }//for loop

        System.out.println("=======");
        for(String n: reversedWord){
            System.out.print(n);
        }


    }//method textBackwards


}
