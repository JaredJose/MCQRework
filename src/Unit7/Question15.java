package Unit7;

public class Question15 {
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 3, 8};
		
		System.out.println(seqSearch(nums, 3));
		System.out.println(seqSearch2(nums, 3));
	}
	
	public static int seqSearch(int[] arr, int target) {
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] == target) {
				return j;
			}
		}
		return -1;
	}
	
	public static int seqSearch2(int[] arr, int target) {
		for(int j : arr) {
			if(j == target) {
				return j;
			}
		}
		return -1;
	}
	
	/*
	 * The primary difference between seqSearch and seqSearch2 is that
	 * in seqSearch the returned integer is the index value within the array
	 * of the taret number. This is while seqSearch2 returns the value of the target 
	 * number if it is found, else it returns -1. 
	 */
}
