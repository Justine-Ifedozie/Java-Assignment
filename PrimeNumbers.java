//Prompt the user to input a positive integer.
//Output a message indicating whether the number is a prime number.
	//Use while loop to generate numbers starting from 1 to a value that is equal to the user input.
		//The generated numbers should be used to divide the user input checking to see if it has a remainder.
import java.util.Scanner;
public class PrimeNumbers {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

//Prompt the user to input a positive integer.
	System.out.print("Enter a positive integer: ");
	int userInput = keyboardInput.nextInt();

//Declared my needed variables before using my loop so I can reuse them outside the loop.
	int counter = 1, addMe = 0, remainder = 0, total = 0;

//Used a loop so I can detect if a number is prime or not.
	while (counter <= userInput) {
	remainder = userInput % counter;
		if (remainder == 0) {
		addMe = +1;
		total = total + addMe;
		}
	counter++;
	}

	if (total == 2) {
	System.out.print("The number you entered is a Prime Number");
	}
	else {
	System.out.print("The number you entered is not a Prime Number");
	}

	}
} 