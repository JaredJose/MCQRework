
public class Question6 {
	/*
	 Consider the following code segment:
	 double d = 0.25;
	 int i = 3;
	 double diff = d - i;
	 System.out.print((int)diff - 0.5);
	 
	 What is printed as a result of executing the code segment?
	 */
	public static void main(String [] args) {
		 double d = 0.25;
		 int i = 3;
		 double diff = d - i; //After the expression is executed, diff has value of -2.75 as d is a double and i is an integer. 0.25 - 3 = -2.75.
		 System.out.print((int)diff - 0.5); //When diff is typecasted to an integer, its decimal value is truncated leaving it with a value of -2. Then when it has another 0.5 subtracted from it, the print displays a double value of -2.5
	}
}
