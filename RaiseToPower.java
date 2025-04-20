//Receive the Base number from the user
//Receive the Power number from the user
//Declare an integer variable as result and initialize it with 1. 
	//(It will be multiplied with the base number multiple times in relation the power number).
//Declare an integer variable as whileController and initialize it with 1, it'll serve as the loop continuation condition
	//whileController will also serve as the increment


import java.util.Scanner;
public class RaiseToPower {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter the Base number: ");
	int base = keyboardInput.nextInt();

	System.out.print("Enter the Base number: ");
	int power = keyboardInput.nextInt();

	int result = 1, whileController = 1;

	while (whileController <= power) {
	result = result * base;
	whileController++;
	}

	System.out.printf("The power of %d = %d", base, result);

	}
}