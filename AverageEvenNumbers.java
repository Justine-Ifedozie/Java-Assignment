import java.util.Scanner;
public class AverageEvenNumbers {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNum = keyboardInput.nextInt();

	System.out.print("Enter second number: ");
	int secNum = keyboardInput.nextInt();

	System.out.print("Enter third number: ");
	int thirdNum = keyboardInput.nextInt();

	System.out.print("Enter fourth number: ");
	int fourthNum = keyboardInput.nextInt();

	System.out.print("Enter fifth number: ");
	int fifthNum = keyboardInput.nextInt();

//Largest Number
	if (firstNum > secNum && firstNum > thirdNum && firstNum > fourthNum && firstNum > fifthNum) {
	System.out.println("The first number entered is the largest number");
	}
	else if (secNum > firstNum && secNum > thirdNum && secNum > fourthNum && secNum > fifthNum) {
	System.out.println("The second number entered is the largest number");
	}
	else if (thirdNum > firstNum && thirdNum > secNum && thirdNum > fourthNum && thirdNum > fifthNum) {
	System.out.println("The third number entered is the largest number");
	}
	else if (fourthNum > firstNum && fourthNum > secNum && fourthNum > thirdNum && fourthNum > fifthNum) {
	System.out.println("The fourth number entered is the largest number");
	}
	else if (fifthNum > firstNum && fifthNum > secNum && fifthNum > fourthNum && fifthNum > thirdNum) {
	System.out.println("The fifth number entered is the largest number");
	}

//Smallest Number
	if (firstNum < secNum && firstNum < thirdNum && firstNum < fourthNum && firstNum < fifthNum) {
	System.out.println("The first number entered is the smallest number");
	}
	else if (secNum < firstNum && secNum < thirdNum && secNum < fourthNum && secNum < fifthNum) {
	System.out.println("The second number entered is the smallest number");
	}
	if (thirdNum < secNum && thirdNum < firstNum && thirdNum < fourthNum && thirdNum < fifthNum) {
	System.out.println("The third number entered is the smallest number");
	}
	if (fourthNum < secNum && fourthNum < thirdNum && fourthNum < firstNum && firstNum < fifthNum) {
	System.out.println("The fourth number entered is the smallest number");
	}
	if (fifthNum < secNum && fifthNum < thirdNum && fifthNum < firstNum && fifthNum < fourthNum) {
	System.out.println("The first number entered is the smallest number");
	}

	int averageCounter = 0;

//Average counter
	if (firstNum % 2 == 0) {
	averageCounter++;
	}
	if (secNum % 2 == 0) {
	averageCounter++;
	}
	if (thirdNum % 2 == 0) {
	averageCounter++;
	}
	if (fourthNum % 2 == 0) {
	averageCounter++;
	}
	if (fifthNum % 2 == 0) {
	averageCounter++;
	}

//Number of Even numbers count
	int aveOne = 0;
	int aveTwo = 0;
	int aveThree = 0;
	int aveFour = 0;
	int aveFive = 0;


	if (firstNum % 2 == 0) {
	aveOne =  firstNum;
	}
	if (secNum % 2 == 0) {
	aveTwo = secNum;
	}
	if (thirdNum % 2 == 0) {
	aveThree = thirdNum;
	}
	if (fourthNum % 2 == 0) {
	aveFour = fourthNum;
	}
	if (fifthNum % 2 == 0) {
	aveFive = fifthNum;
	}

//Sum and dividing of even numbers total

	int sumOfAverage = (aveOne + aveTwo + aveThree + aveFour + aveFive);

	int average = sumOfAverage / averageCounter;
	System.out.println("Average of Even numbers is: " + average);

	}
}