package Unit6;

public class Question13 {
	public static  void main(String[] args) {
		int[] values = {1, 15, 26, 5, 101, 12};
		int maximum = values[0];
		
		for(int k = 1; k < values.length; k++) {
			if (values[k] > maximum) {
				maximum = values[k];
			}
		}
		System.out.println(maximum);
		
		/*
		 * The maximum variable must be intialized to values[0] because the
		 * for loop begins by comparing values[1] to maximum. Therefore, values[0]
		 * must be stored within maximum, or else there will be errors if the largest
		 * value in the array is values[0].
		 */
	}
}
