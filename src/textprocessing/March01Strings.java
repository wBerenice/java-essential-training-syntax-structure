package textprocessing;

public class March01Strings {
    /*
    STRINGS ARE OBJECTS, they are neither a primitive data type nor a wrapper class.

     */

    public static void main(String[] args){

        String myName = "Berenice";

        char[] myNameLetters = {'B', 'e', 'r', 'e'};
        String myNameStringified = new String(myNameLetters);

        System.out.println(myName.getClass());//String
        System.out.println(myNameLetters.getClass());//Array of CHAR (characters)
        System.out.println(myNameStringified.getClass());//String


    }//main


}//class March01Strings
