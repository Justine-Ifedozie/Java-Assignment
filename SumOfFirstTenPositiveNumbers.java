//Declare an int variable then initialize it to 1.
//Use for loop to make the intialized variable count 10 times.
//Save the counts then add up all the counted numbers to get the sum.


public class SumOfFirstTenPositiveNumbers {
	public static void main (String[] args) {

	int positive = 1;
	int add = 0;

	for (int i = 11; positive  != i; positive++) {
	add = add + positive;
	}
	System.out.println(add);

	}
} 