//What is a factorial value? It is the multiplication of a given value by all the numbers that are lesser than it.

//Prompt the user to input a number (so the factorial of the inputed number can be calculated).
//Declare an integer variable, lets name it "loopCondition" and initialize it with the value of 1.
	//It'll serve the purpose of determining how many times the loop should run.
	//The loop should continue running as long as loopCondition is less than or not equal to the user input value.
	//loopCondition should be set as an increment in the loop. (This will enable it add up all the values lesser than the entered number).
//Declare another integer variable lets name it "factorial" and initialize it with 1. This variable will serve two purpose.
	//First purpose is to enable "loopCondition" multiply all the values it accumulated during the loop. (Multiply factorial by loopCondition).
	//Second purpose is to store the "loopCondition" mutiplied values.
//Print out the result by displaying the multiplied  value stored in "factorial" variable. 


import java.util.Scanner;
public class FactorialValue {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter a number to get the factorial value: ");
	int userInput = keyboardInput.nextInt();

	int loopCondition = 1;
	int factorial = 1;

	while (loopCondition <= userInput) {
	factorial = factorial * loopCondition;
	++loopCondition;
	}
	System.out.print("Factorial Value = " + factorial);

	}
}