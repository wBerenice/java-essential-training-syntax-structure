package repetition_structures;

import java.util.Random;

public class Feb17ChallengeRollDieGame {

    public static void main(String[] args){

        //CHALLENGE!!
        /*
        ROLL the DIE GAME
        1. Travel the entire game board of 20 spaces within five die rolls
        A die has 6 sides. And each side contains a number between one and six
        - Your program will automatically roll de die and advance
        the player that number of spaces on the game board
         */

        /*
        1. Generate random number between 1 and 6 to represent die roll
        2. Tell player which game space they are on and how many more
        spaces they have to go to win
        3. Repeat four times (five rolls in total)
        4. After 5 roll, if they are greater than or less
        than 20 spaces exactly, they lose.
        5. If the player advances exactly 20 spaces within
        five die rolls, they win
        EXAMPLE: 3, 3, 3, 5, 6

         */
        Random random = new Random();
        int die = random.nextInt(6) + 1;
//        System.out.println(die);

        //What we know
        int boardSpaces = 20;
        int totalRolls = 5;
//        int userSpaces = 0;
        int userSpacesTotal = 0;

    for(int i = 0; i < totalRolls; i++){
        System.out.println("Roll #" + (i+1));
        int newDie = random.nextInt(6) + 1;
        System.out.println("You've rolled a " + newDie);
        userSpacesTotal += newDie;
        if(userSpacesTotal == boardSpaces){ //20
            System.out.println("The current roll is #" + (i+1) + " and you're on space " + userSpacesTotal + ". Congrats, you win!");
            break;
        }else if(userSpacesTotal > boardSpaces){
            System.out.println("You're now on space " + (userSpacesTotal) + " so you already went over by " + (userSpacesTotal - boardSpaces));
            break;
        }else if(i == 4 && userSpacesTotal < boardSpaces){
            System.out.println("You're now on space " + userSpacesTotal + " :(");
            break;
        }else{
            System.out.println("You're now on space " + (userSpacesTotal) + " and have " + (boardSpaces - userSpacesTotal) + " more to go");
        }
    }//for loop
        if(userSpacesTotal > boardSpaces){
            System.out.println("Sorry, you lost. Your current space is " + userSpacesTotal + " so you went OVER by " + (userSpacesTotal - boardSpaces));
        }else if(userSpacesTotal < boardSpaces){
            System.out.println("Sorry, you lost. Your current space is " + userSpacesTotal + " so you were short by " + (boardSpaces - userSpacesTotal));
        }

}//main


}//Feb17ChallengeRollDieGame
