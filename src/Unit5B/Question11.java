package Unit5B;

public class Question11 {
	public static void main(String [] args) {
		Person andy = new Person("Andrew", 5, 6);
		Person ben = new Person("Benjamin", 6, 5);
		System.out.println(andy.compareHeights(ben));
		
		/*
		 * This code snippet when executed will print "Andrew" to the console. This is because the compareHeights() method returns the name
		 * of the person who is shorter. The compareHeights() method works by converting the Person's heights into inches and then comparing the integer value.
		 */
	}
}
