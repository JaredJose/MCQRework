package Unit1;

public class Question5 {
	/*
	 Consider the following code segment, which is intended to display 6.0
	 double fact1 = 1 / 2;
	 double fact2 = 3 * 4;
	 double product = fact1 * fact2;
	 System.out.println(product);
	 */
	
	public static void main(String [] args) {
		double fact1 = 1 / 2; //Although fact1 is a double, the divisor and the dividend are both integers. Therefore the result of the expression will be 0 as the decimal is truncated. This can be fixed by typecasting one of them as a double preventing integer division and preserving the decimal. 
		double fact2 = 3 * 4;
		double product = fact1 * fact2;
		System.out.print("Incorrect Implementation Output: ");
		System.out.println(product);
		
		double fact3 = (double) 1 / (double) 2; //typecast to force decimal point division
		double fact4 = 3 * 4;
		double product2 = fact3 * fact4;
		System.out.print("Correct Implementation Output: ");
		System.out.println(product2);
	}
}
