package Unit6;

public class Question6 {
	public static void main(String[] args) {
		String[] fruits = {"apples", "bananas", "cherries", "dates"};
		
		
		//Option I
		try {
			for(int i = 0; i <= fruits.length; i++) {
				System.out.println(fruits[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		//Option II
		for(int j = 0; j <= fruits.length -1; j++) {
			System.out.println(fruits[j]);
		}
		
		//Option III
		for(int k = 1; k <= fruits.length; k++) {
			System.out.println(fruits[k-1]);
		}
		
		/*
		 * Option I is the only option that will throw an ArrayIndexOutOfBoundsException
		 * This is because it will try to access the 4 element array a total of 5 times
		 * going outside the bounds of the array.
		 * The other two options will either stay within the boundaries of the array,
		 */
	}
}
