package decision_structures;

import java.util.Scanner;

public class SwitchPracticePB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your favorite color?");
        String colorFav = scanner.next();
        scanner.close();


        switch(colorFav){
            case "Azul":
                System.out.println("Your favorite color is: " + colorFav);
//                break;
            case "Rojo":
                System.out.println("2Your favorite color is: " + colorFav);
                break;
            default:
                System.out.println("3It's not on the list. Try again");
        }//switch
    }
}
