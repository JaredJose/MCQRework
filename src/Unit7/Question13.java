package Unit7;

import java.util.ArrayList;

public class Question13 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(3);
		
		System.out.println(sequentialSearch(numbers, 3));
		System.out.println(modifiedSequentialSearch(numbers, 3));
	}
	
	/*
	 * The sequential search algorithm will return either the index value of the first
	 * occurrence of target in elements or a -1 if target doesn't exist in elements
	 */
	public static int sequentialSearch(ArrayList<Integer> elements, int target) {
		for(int j = 0; j < elements.size(); j++) {
			if(elements.get(j) == target) {
				return j;
			}
		}
		return -1;
	}
	
	/*
	 * The modified sequential search algorithm will return either
	 * the index value of the last occurrence of target in elements
	 * or a -1 if target doesn't exist in elements
	 */
	public static int modifiedSequentialSearch(ArrayList<Integer> elements, int target) {
		for(int j = (elements.size() - 1); j >= 0; j--) {
			if(elements.get(j) == target) {
				return j;
			}
		}
		return -1;
	}
}
