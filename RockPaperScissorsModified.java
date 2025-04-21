/*PseudoCode for Rock Paper Scissors revised. 
The rule is Rock beats Scissors, scissors beats Paper and paper beats Rock. */

//Randomly generate a number between 0, 1 or 2 (0 is scissors, 1 is rock, 2 is paper).
//Prompt the user to enter a number between 0, 1 and 2.
// Compare the number the user entered with the computer generated number then display a message indicating whether the user or compter won, loss or draw.
//Let the user continuosly play until either the user or the computer win more than two times than its opponent.

import java.util.Scanner;
public class RockPaperScissorsModified {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.println("Enter a guess between 0, 1 and 2"); 
	int scissors = 0, rock = 1, paper = 2;
	int userGuess = -1;
	int userWin = 0, computerWin = 0;

	while (userWin != 3) {
	int computerRandom = (int) (Math.random () * 3);
	//System.out.println("Computer Random for testing: " + computerRandom);
	System.out.print("Enter a guess: ");
	userGuess = keyboardInput.nextInt();
	if (userGuess == scissors && computerRandom == rock) System.out.println("You're Scissors and computer is Rock. You loose, try again!");
	if (userGuess == scissors && computerRandom == paper) System.out.println("You're Scissors and computer is Paper. You Win! ");
	if (userGuess == scissors && computerRandom == scissors) System.out.println("You're Scissors and computer is Scissors. It's a draw, try again!");
	if (userGuess == scissors && computerRandom == paper) ++ userWin;
	if (userGuess == scissors && computerRandom == rock) ++ computerWin;

	if (userGuess == rock && computerRandom == scissors) System.out.println("You're Rock and computer is Scissors. You Win!");
	if (userGuess == rock && computerRandom == paper) System.out.println("You're Rock and computer is Paper. You loose, try again! ");
	if (userGuess == rock && computerRandom == rock) System.out.println("You're Rock and computer is Rock. It's a draw, try again!");
	if (userGuess == rock && computerRandom == scissors) ++ userWin;
	if (userGuess == rock && computerRandom == paper) ++ computerWin;

	if (userGuess == paper && computerRandom == rock) System.out.println("You're Paper and computer is Rock. You Win!");
	if (userGuess == paper && computerRandom == scissors) System.out.println("You're Paper and computer is Scissors. You loose, try again! ");
	if (userGuess == paper && computerRandom == paper) System.out.println("You're paper and computer is paper. It's a draw, try again!");
	if (userGuess == paper && computerRandom == rock) ++ userWin;
	if (userGuess == paper && computerRandom == scissors) ++ computerWin;

	//System.out.println("UserWin addition test " + userWin);
	if (userWin == 3) userWin = 3;

	//System.out.println("ComputerWin addition test " + computerWin);
	if (computerWin == 3) userWin = 3;
	}

	}
}