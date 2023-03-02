package textprocessing;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

/*
CHALLENGE:
-Validate the complexity of a proposed password.

USER
-Username: johndoe
-Password: ABC_1234

TASKS:
1. Prompt the user to enter a new password
2. Verity that the password is:
    -At least 8 characters long
    -Contains an uppercase letter
    -Contains a special character
    -Does not contain teh username (johndoe)
    -Is not the same as the old password (ABC_1234)
 */
public class PasswordValidator {
    public static void main(String[] args){
        final String username = "johndoe";
        String oldPassword = "ABC_1234";

        validateNewPassword(username, oldPassword);
        String specialCharacters = "!,#,$,%,&,*,@";
        String[] arraySpecialCharacters = specialCharacters.split(",");

    }//main

    public static void validateNewPassword(String username, String oldPassword){
        boolean passwordChanged = false;
            Scanner scanner = new Scanner(System.in);
        boolean containsAnUpperCaseLetter = false;
        boolean containsASpecialCharacter = false;


        while(passwordChanged != true){
            System.out.println("Enter your new password");
            String newPassword = scanner.next();
            scanner.reset();
            boolean usernameOldPassword = newPassword.equals(username) || newPassword.equals(oldPassword);

            for(int i =0; i < newPassword.length(); i++){
                char x = newPassword.charAt(i);
                if(Character.isUpperCase(x) && (x == '!')){
                    containsAnUpperCaseLetter = true;
                    containsASpecialCharacter = true;
                }
            }//for loop


            if(usernameOldPassword){
                System.out.println("Your new password must not contain your username or old password");
                System.out.println("Try again...");
            }else if(((newPassword.length() >= 8) && (usernameOldPassword == false)) && (containsAnUpperCaseLetter && containsASpecialCharacter)){
                System.out.println("your password is different and has 8 or more characters (with an uppercase)");
                passwordChanged = true;

            }//else if
            else{
                System.out.println("Try again!");
            }
        }//while loop

            scanner.close();
    }//method validateNewPassword



}//class PasswordValidator

