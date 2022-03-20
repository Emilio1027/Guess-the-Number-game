package org.example;

import java.util.Random;
import java.util.Scanner;


public class App {
    /**
     * You are going to make a "Guess the Number game".The computer will "think" of a secret number from 1 to 20 and ask
     * the user to guess it. After each guess, the computer will tell the user whether the number is too
     * high or too low.
     * The user wins if they can guess the number within six tries The program should look like this in the console:
     * Hello! What is your name?
     * Well, Emilio, I am thinking of a number between 1 and 20
     * Take a guess.
     * 10
     * Your guess is too high.
     * Take a guess.
     * 2
     * Your guess is too low
     * Take a guess.
     * 4
     * Good job, Emilio! You guessed my number 3 guesses!
     * would you like to play again? (y or n)
     * n
     * Process finished with exit code 0
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String playAgain = "";

        System.out.println();
        System.out.println();
        System.out.println(" ________________________________ ");
        System.out.println("|         WELCOME TO THE         |");
        System.out.println("|        GUESS THE NUMBER        |");
        System.out.println("|______________GAME______________|");
        System.out.println();
        System.out.println("You are going to make a Guess the " +
                "Number game.\n" + "The computer will think of a " +
                "secret number from 1 to 20\n" + "and ask the user " +
                "to guess it. After each guess, the computer\n" +
                "will tell the user whether the number is too high or" +
                " too low.\n");


        System.out.println("The user WINS if they can guess the number within six tries");
        System.out.println();
        System.out.print("Hello! What is your name? : ");
        String name = scanner.nextLine();
        System.out.println("Well, " + name + " I am thinking of a number between 1 and 20");
        System.out.println();

        do {

            Random number = new Random();//accessing the Random class
            /**the computer will pick a number from 1 to 20
             * System.out.println("Secret number: " + secretNumber); this will show which is our
             * secret number,so we can test our program
             */
            int secretNumber = number.nextInt(20) + 1;

            int tries = 0;//how many times the player has tried to win, initial count

            while (true) {

                System.out.print("Take a guess (1 - 20): ");
                int playerGuessNumber = scanner.nextInt();
                tries++;
                System.out.println();

                if (tries <= 5) {

                    if (playerGuessNumber == secretNumber) {
                        System.out.println();
                        System.out.println("Good job! " + name + " You guessed my number within " + tries + " tries");
                        System.out.println("The secret number was: " + secretNumber);
                        System.out.println();
                        break;
                    }
                    if (secretNumber > playerGuessNumber) {
                        System.out.println("Your guess is too low: ");
                    } else {
                        System.out.println("Your guess is too high: ");
                    }

                } else {//if the user gets the answer wrong more than 6 times
                    if (secretNumber != playerGuessNumber) {
                        System.out.println();
                        System.out.println("Sorry, you have to guess the correct number in 6 tries: Ran Out Of Attempts");
                        System.out.println("The secret number was: " + secretNumber);
                        System.out.println();

                        break;
                    }

                }
            }           System.out.println("would you like to play again? (y or n): ");
                        playAgain = scanner.next();
        }   while (playAgain.equalsIgnoreCase("y"));
                        System.out.println("Thank you for playing GUESS THE NUMBER GAME");
                        scanner.close();


    }
}


