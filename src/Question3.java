
public class Question3 {
	/*
	 Which of the following arithmetic expressions evaluates to 1?
	 I. 2 / 5 % 3
	 II. 2 / (5 % 3)
	 III. 2 / 5 + 1
	 */
	
	public static void main(String [] args) {
		int num1 = 2 / 5 % 3;
		// After this expression is executed, num1 will have a value of 0. This is because the integer division of 2/5 will yield a value of 0. Then 0 % 3 will also yield a value of 0.
		
		int num2 = 2 / (5 % 3);
		// After this expression is executed, num2 will have a value of 1. This is because the expression within the parentheses yields a 2. Then 2 / 2 yields a final value of 1.
		
		int num3 = 2 / 5 + 1;
		// After this expression is executed, num3 will have a value of 1. This is because the integer division of 2 / 5 truncates the decimal value which makes it equal 0. Then 0 + 1 yields a final value of 1.
		
		System.out.println("Values");
		System.out.println("I Result: " + num1);
		System.out.println("II Results: " + num2);
		System.out.println("III Results " + num3);
	}
}
