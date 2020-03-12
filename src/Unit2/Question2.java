package Unit2;

public class Question2 {
	/*
	 Consider the following class declaration:
	 public class Thing {
	 private String color;
	 
	 public Think(){
	 color = blue;
	 }
	 
	 public Thing(String setColor){
	 color = setColor;
	 }
	 }
	 Which of the following code segments, when appearing in a class other than Thing, would create a reference of type Thing with a value of null?
	 */
	public static void main(String [] args) {
		// Choice A
		Thing someThing1 = new Thing("Green"); //This calls one of the constructors of Thing, thus instantiating the object. Therefore, the object does not have a value of null.
		
		//Choice B
		Thing someThing2 = new Thing(""); // This calls one of the constructors of Thing, thus instantiating the object. The Thing object will get have a String color of "". Despite it not containing anything meaningful, it will still have a data and therefore not be null.
		
		//Choice C
		Thing someThing3 = new Thing(); // This calls the dault constructor of Thing, thus instantiating the object. This will causes the someThing3 to have data and therefore not be null.
		
		//Choice D (Correct)
		Thing someThing4; // This code snippet will declare the someThing4 object, however it does not instantiate it. This will leave the object with a default value of null and will be the correct answer.
		
		//Choice E
		//Thing("Green"); This code snippet makes no sense syntaxwise. You need to declare the object before you can instantiate it. The line itself is commented out as it creates a compiler error.
	}
}
