//Note: Company salespeople are paid $200/ week.
	//Weekly they also receive  9% of gross sales. (0.09 percent).
	//$200 plus 9% of gross sales is what the salespeople earn per week.

//Prompt the salesperson to enter the cost of items sold last week. (Gross sale).
	//Save the value in a double variable.
	//Use indefinite loop to avoid limiting the number of entries.
//Calculate and display that salesperson's total earning for the week.
	//Multiply the gross sales with 0.09. 
	//Add the multiplied result with their weekly $200 earning.

import java.util.Scanner;
public class SalesCommissionCalculator {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
	double weeklyPay = 200; 
	double grossPercent = 0.09;
	double itemsSold = 0;
	double totalItemsSold = 0;
	double grossEarnings = 0;
	double totalEarnings = 0;

	while (itemsSold != -1) {
	System.out.print("Press -1 to quit or Enter the cost of items sold for last week: ");
	itemsSold = keyboardInput.nextDouble();

	if (itemsSold != -1) totalItemsSold = totalItemsSold + itemsSold;
	grossEarnings = totalItemsSold * grossPercent;
	totalEarnings = weeklyPay + grossEarnings;
	System.out.println("Your total earnings for last week is: " + totalEarnings);
	}


	}

}
