//Declare and initialize two int vaiables "a" and "b" with 0 and 1 respectively.
//Display a string showing the header in the question a, b, pow(a, b).
//Use loop to set a condition for variable "a" to increase 5 time also set variable "b" to increase.
//Use the built in raise to power method to get the power of "a^b" then allow loop repeat it. for all a and b values.
//Save the raise to power value in a double variable.
//Convert double to int.
//Display the looped value of "a", "b" and int converted power in one print statement using tab to space them properly.


public class PrintTable {
	public static void main (String[] args) {
	
	int a = 0, b = 1;
	System.out.println("a\tb\tpow(a, b)");
	double power;
	int castedFloats;

	while (a != 5) {
	a++;
	b++;
	power = (Math.pow(a, b));
	castedFloats = (int) power;

	System.out.printf("%d \t%d \t%d\n", a, b, castedFloats);
	}

	}
}
