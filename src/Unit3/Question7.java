package Unit3;

public class Question7 {
	public static void main(String[] args) {
		String first = new String("duck");
		String second = new String("duck");
		String third = new String("goose");
		
		if(first == second) {
			System.out.print("A");
		}
		else if(second == third) {
			System.out.print("B");
		}
		else if(first.equals(second)) {
			System.out.print("C");
		}
		else if(second.equals(third)) {
			System.out.print("D");
		}
		else
			System.out.print("E");
		
		//This code will print out "C" because the content second string has the same content as the first string. You cannot compare them using the boolean equivalent operator because that operator compares the object that its pointing at instead of the contents. So therefore the first == second will be false.
	}
}
