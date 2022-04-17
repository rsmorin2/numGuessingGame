package com.r4ndy.numGuessingGame;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Show Welcome Message
        System.out.println("Hello, welcome to the number guessing game.");

        // Request name and assign to string var
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Thank you, hello " + name + "!");

        String startStr;     //Declare string for user input

        //Loop to start game, scanner for user input
        do {
            Scanner startScanner = new Scanner(System.in);
            System.out.print("Would you like to start the game? Type N for no, any other key to start: ");
            startStr = startScanner.nextLine();
        }
        while (startStr.equalsIgnoreCase("N"));

        //Print line to define parameters of the game
        System.out.print("Guess a number between 1 and 25.");

        // Start Game input loop for 5 guesses to answer random number
        Random random = new Random();   //Declare Random Number
        int userGuessNum = 0;   //init user input number for scanner
        int gameRndNum = random.nextInt(1,25);  //init random number for game

        //For loop, init to 5 guesses for game
        for (int i = 5; i > 0; i--) {
            if (gameRndNum == userGuessNum) {   //if random number equals guess, notify user that the guess is correct,
                                                // break loop and exit --- see line 57 for incorrect guess
                System.out.println("You guessed correctly! The number is " + gameRndNum + "!");
                break;
            }
            Scanner randomGuessSC = new Scanner(System.in); //User guess at random number input
            System.out.println("Type the number you'd like to guess! You have " + i + " guesses left!");
            userGuessNum = randomGuessSC.nextInt();

            // if else statement to determine if guess is higher or lower than random number and notify user if higher or lower
            if (gameRndNum != userGuessNum) {
                if (gameRndNum > userGuessNum) {
                    System.out.println("Try guessing higher!");
                }else{
                    System.out.println("Try guessing lower!");
                }
            }
        }
        // Exit and compare random number to guess, if incorrect notify user --- see line 38 for correct guess notification
        if (gameRndNum != userGuessNum) {
            System.out.println("I'm Sorry, the correct number is " + gameRndNum + "! Better luck next time!");
        }
        // Thank user for playing, end program
        System.out.println("Thank you for playing " + name + "!");
    }
}
