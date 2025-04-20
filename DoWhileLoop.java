//Prompt a user to enter two numbers.
//Add the two numbers then display the sum.
//Use loop to ask the user to repeat the procedure again if he or she wishes.
//If they wish to perform the operation again then continue otherwise terminate the game.

import java.util.Scanner;
public class DoWhileLoop {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	int counter = 1;
	boolean stopper = true;

	do {
		System.out.print("Enter first integer: ");
		int firstNum = keyboardInput.nextInt();

		System.out.print("Enter second integer: ");
		int secNum = keyboardInput.nextInt();

		int sum = firstNum + secNum;
		System.out.printf("The sum of the numbers you entered is: %d%n", sum);

		System.out.print("If you wish to perform the operation again press 1 or press 0 to quit: ");
		int stopNum = keyboardInput.nextInt();

		if (stopNum == 0) stopper = false;

		counter++;
	} while (stopper != false);

	}
}
