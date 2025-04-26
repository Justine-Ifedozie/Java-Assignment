import java.util.Scanner;
public class NumberToWords {

	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	System.out.print("Enter a number between 1 to 10: ");
	int enteredNum = keyboardInput.nextInt();

//Condition statement
	if (enteredNum == 1) {
	System.out.print("You entered: One");
	}	
	else if (enteredNum == 2) {
	System.out.print("You entered: Two");
	}	
	else if (enteredNum == 3) {
	System.out.print("You entered: Three");
	}
	else if (enteredNum == 4) {
	System.out.print("You entered: Four");
	}
	else if (enteredNum == 5) {
	System.out.print("You entered: Five");
	}
	else if (enteredNum == 6) {
	System.out.print("You entered: Six");
	}
	else if (enteredNum == 7) {
	System.out.print("You entered: Seven");
	}
	else if (enteredNum == 8) {
	System.out.print("You entered: Eight");
	}
	else if (enteredNum == 9) {
	System.out.print("You entered: Nine");
	}
	else if (enteredNum == 10) {
	System.out.print("You entered: Ten");
	}
	else {
	System.out.print("You entered an invalid number");
	}


	}
}