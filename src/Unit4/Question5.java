package Unit4;

public class Question5 {
	public static void main(String [] args) {
		int total = 0;
		int total2 = 0;
		
		for (int k = 0; k <= 100; k += 2) {
		total += k;
		}
		System.out.println(total);
		
		for(int k = 1; k <= 101; k += 2) {
			total2 += k - 1;
		}
		
		System.out.println(total2);
	}
}
