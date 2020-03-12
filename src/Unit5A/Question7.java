package Unit5A;

public class Question7 {
	public static void main(String [] args) {
		String phrase = "joshua";
		String key = "sh";
		int index = 2;
		boolean result = false;
		if(0 <= index  && index < phrase.length() + key.length()) {
			result = substringFound(phrase, key, index);
		}
		
		System.out.println(result);
	}
	
	public static boolean substringFound(String phrase, String key, int index) {
	String part = phrase.substring(index, index + key.length());
	return part.equals(key);
	}
}
