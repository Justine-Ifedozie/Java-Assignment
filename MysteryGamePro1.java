//Pseudocode for MysteryGameLoop.

//Generate random numbers between 1 - 10
//Ask the user to predict a number between  1 - 10 that the computer might have suggested.
//Double check each user prediction against what the computer predicted. (Use loop to give the user 3 trials).
	//if user prediction is higher than the computer prediction, print out a statement about it. (End the game after three trials be it high or low predictions).
	//if user prediction is lower than the computer prediction, print out a statement about it. (End the game after three trials be it high or low predictions).
	//if user prediction is equal to or exactly what the computer predicted, print out a statement about it. Then end the game.

import java.util.Scanner;
public class MysteryGamePro1 {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	int computerRandom = (int) (Math.random () * 10 +1);
		System.out.println(computerRandom);

	System.out.print("Enter a guess between 1 - 10, you have only 3 tries: ");
	int userGuess= keyboardInput.nextInt();

	int whileCounter = 1;

	if (userGuess == computerRandom) whileCounter = 3;
	if (userGuess == computerRandom) System.out.println("Your guess is correct!");

	while (userGuess != computerRandom) {
	if (userGuess > computerRandom) System.out.println("Oops you guessed too high, you have guessed " + (whileCounter) + " times");
	if (userGuess < computerRandom) System.out.println("Oops you guessed too low, you have guessed " + (whileCounter) + " times");
	System.out.print("You have another trial, enter a guess: ");
	userGuess = keyboardInput.nextInt();
	if (userGuess == computerRandom) System.out.println("Your guess is correct!");
	if (whileCounter == 2) userGuess = computerRandom;
	if (whileCounter == 2) System.out.println("You ran out of guesses!");
	whileCounter = whileCounter + 1;
	}


	}
}