package Unit3;

public class Question6 {
	public static void main(String [] args) {
		int j = 1, k = 3, m =5;
		
		boolean result = !((j == k) && (k > m));
		boolean result2 = (j != k) || (k <= m);
		
		if(result == result2) {
			System.out.println("The two expressions are equivalent.");
		}
	}
}
