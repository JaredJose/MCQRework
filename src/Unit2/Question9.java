package Unit2;

public class Question9 {
	/*
	 The code segment is intended to randomly print one of the values 2, 4, 6, or 8 with equal probability
	 
	 int val = *** missing code ***
	 val *= 2
	 System.out.print(val);
	 
	 Which of the following can be used to replace ***missing code*** so that the code segment works as intended
	 */
	public static void main(String [] args) {
		int val1 , val2, val3, val4, val5;
		//Choice A
		//val1 = Math.random() * 4 + 1;
		//Math.random() returns a double between 0 and 1. This leads to a compiler error when trying to assign the double value to an integer
				
		//Choice B
		//val2 = Math.random() * 8;
		//Math.random() returns a double between 0 and 1. This leads to a compiler error when trying to assign the double value to an integer
		
		//Choice C
		val3 = (int) (Math.random() * 4);
		//This code snippet will return a random number between 0 and 3 but will have a one of error.
		
		//Choice D (Correct)
		val4 = (int) (Math.random() * 4 +1);
		//This code snippet will assign a random number within 1 to 4 (preventing a truncation of decimal error when multiplying by 2.
		
		//Choice E
		val5 = (int) (Math.random() * 8 + 1);
		//This code snippet will assign a random number within 1 to 8. After this gets multiplied by 2 it will be well beyond the preferred output.
		
		val4 *= 2;
		
		System.out.println("Random Number (2, 4, 6, or 8): " + val4);
	}
}
