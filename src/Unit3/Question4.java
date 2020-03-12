package Unit3;

public class Question4 {
	
	static int result = 0;
	static int x = 25, y= 10;
	
	public static void main(String[] args) {
		//method1 and method2 will output the same result for any value of x or y
		method1();
		System.out.println();
		method2();
	}
	
	public static void method1() {
		if(x>y) {
			result = x-y;
			System.out.print(result);
		}
		else if (x<y) {
			result = y - x;
			System.out.print(result);
		}
		else {
			System.out.print(result);
		}
	}
	
	public static void method2() {
		if(x<y) {
			System.out.print(y-x);
		}
		else {
			System.out.print(x-y);
		}
	}
}
