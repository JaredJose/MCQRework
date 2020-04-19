package Unit7;

public class Question16 {
	public static void main(String[] args) {
		int[] arr = {10, 8, 3, 4};
		insertionSort(arr);
	}
	
	public static void insertionSort(int[] elements) {
		for(int j = 1; j < elements.length; j++) {
			int temp = elements[j];
			int possibleIndex = j;
			while(possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex--; //*
			}
			elements[possibleIndex] = temp;
		}
	}
	
	/*
	 * The possibleIndex decrement in line 15 is executed each time an element
	 * is shifted to the right. Given the starting array of 10, 8, 3 and 4; there 
	 * would be a total of 5 shifts to the right. 
	 */
}
