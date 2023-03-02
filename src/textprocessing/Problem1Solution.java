package textprocessing;

public class Problem1Solution {
    public static void main(String[] args){
        countWords("I love Java");
        reverseString("stop");
    }//main

    /*
    1. Splits a String into an array by tokenizing it.
    2. Counts words and prints them
    3. @param text Full string to be split
     */
    public static void countWords(String text){
        String[] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);
        for(int i=0; i < words.length; i++){
            System.out.println(words[i]);
        }

    }//countWords method

    //A STRING IS AN ARRAY OF CHARACTERS
    public static void reverseString(String text){
        for(int i = text.length() -1 ; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
    }//method reverseString


}//class Problem1Solution
