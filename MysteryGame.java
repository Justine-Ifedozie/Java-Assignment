import java.util.Scanner;
import java.util.Random;
public class MysteryGame {

	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	Random computerInput = new Random();

	int generatedNumber = computerInput.nextInt(11);
	System.out.println(generatedNumber);

	System.out.print("Enter a guess between number 1 to 10: ");
	int userGuess = keyboardInput.nextInt();

//Condition to allow the user try three times before quiting the game

//Condition statement

	if (generatedNumber == 1 && userGuess > 1) {
	System.out.printf("The Computer generated %d so the number you entered is too high, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	
	else if (generatedNumber == 2 && userGuess > 2) {
	System.out.printf("The Computer generated %d so the number you entered is too high, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 2 && userGuess < 2) {
	System.out.printf("The Computer generated %d so the number you entered is too low, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 3 && userGuess > 3) {
	System.out.printf("The Computer generated %d so the number you entered is too high, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 3 && userGuess < 3) {
	System.out.printf("The Computer generated %d so the number you entered is too low, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 4 && userGuess > 4) {
	System.out.printf("The Computer generated %d so the number you entered is too high, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 4 && userGuess < 4) {
	System.out.printf("The Computer generated %d so the number you entered is too low, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 5 && userGuess > 5) {
	System.out.printf("The Computer generated %d so the number you entered is too high, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 5 && userGuess < 5) {
	System.out.printf("The Computer generated %d so the number you entered is too low, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 6 && userGuess > 6) {
	System.out.printf("The Computer generated %d so the number you entered is too high, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 6 && userGuess > 6) {
	System.out.printf("The Computer generated %d so the number you entered is too low, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 7 && userGuess > 7) {
	System.out.printf("The Computer generated %d so the number you entered is too high, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 7 && userGuess < 7) {
	System.out.printf("The Computer generated %d so the number you entered is too low, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 8 && userGuess > 8) {
	System.out.printf("The Computer generated %d so the number you entered is too high, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 8 && userGuess < 8) {
	System.out.printf("The Computer generated %d so the number you entered is too low, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 9 && userGuess > 9) {
	System.out.printf("The Computer generated %d so the number you entered is too high, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 9 && userGuess < 9) {
	System.out.printf("The Computer generated %d so the number you entered is too low, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 10 && userGuess > 10) {
	System.out.printf("The Computer generated %d so the number you entered is too high, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	if (generatedNumber == 10 && userGuess < 10) {
	System.out.printf("The Computer generated %d so the number you entered is too low, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	else {
	System.out.printf("Oops you have failed three time!");
	}
	
//Condition Statement for you won
	if (generatedNumber == 1 && userGuess > 9) {
	System.out.printf("The Computer generated %d so the number you entered is too high, enter another guess: ", generatedNumber);
	userGuess = keyboardInput.nextInt();
	}
	
	}
}