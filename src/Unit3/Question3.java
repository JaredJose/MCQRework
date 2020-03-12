package Unit3;

public class Question3 {
	public static void main(String [] args) {
		String weather;
		int temp = 30;
		//int temp = 51;
		//int temp = 60;
		
		//The two if else statements operate independant of each other. This causes for issues to arise in the colder numbers. For example, in the case of the temperature being 30 the first if else operates as intended and assigns "cold" to weather. However, due to it being two independant if...else... statements it procs the second if...else.. which operates not as intended assigning a "warm" to weather.
		
		if(temp <= 31) {
			weather = "cold";
		}
		else {
			weather = "cool";
		}
		
		
		if(temp >= 51) {
			weather = "moderate";
		}
		else {
			weather = "warm";
		}
		System.out.print(weather);
	}
}
