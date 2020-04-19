package Unit7;

public class Question18 {
	public static void main(String[] args) {
		int[] arr = {30, 40, 10, 50, 20};
		selectionSort(arr);
	}
	
	public static void selectionSort(int[] elements) {
		for(int j = 0; j < elements.length - 1; j++) {
			int minIndex = j;
			for(int k = j + 1; k < elements.length; k++) {
				if(elements[k] < elements[minIndex]) {
					minIndex = k;
				}
			}
			if(j != minIndex) {
				int temp = elements[j];
				elements[j] = elements[minIndex];
				elements[minIndex] = temp; //*
			}
		}
	}
	
	/*
	 * The swap that occurs in lines 18 to 20 would execute each time
	 * a pair of values are swapped into their correct positions. In the case
	 * of the test values there would be a total of 3 swaps. 
	 */
}
