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
		Thing someThing2 = null;
	}
}
