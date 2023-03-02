package decision_structures;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type your score");
        char score = scanner.next().charAt(0);
//        String score = scanner.next();

        if(score == 'A'){
            System.out.println("Congrats!");
        }else if(score == 'B'){
            System.out.println("Your score was " + score + "You can improve");
        }else if(score == 'C'){
            System.out.println("Your score was " + score + "but don't worry, you can improve");
        }else{
            System.out.println("You are lost with a(n)" + score);
        }



    }
}
