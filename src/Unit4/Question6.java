package Unit4;

public class Question6 {
	public static void main(String[] args) {
		int result1 = digitSum1(10);
		int result2 = digitSum2(10);
		
		System.out.println("Result of digitSum1(): " + result1);
		System.out.println("Result of digitSum2(): " + result2);
	}
	
	public static int digitSum1(int num)
	{
	int total = 0;
	while (num > 0)
	{
	total += num % 10;
	num /= 10;
	}
	return total;
	}
	
	public static int digitSum2(int num) {
		int total = 0;
		for(int k = num; k > 0 ; k /= 10) {
			total += k % 10;
		}
		return total;
	}
}
