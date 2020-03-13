package Unit5A;

public class Question14 {
	public class Superhero{
		private String name;
		private String secretIdentity;
		private int strength;
		
		public Superhero(String realName, String codeName) {
			name = realName;
			secretIdentity = codeName;
			strength = 5;
		}
		
		
		//The correct modification to this code is to change the return type of levelUp() into void. This
		//is warranted because levelUp is modifying a class variable, and thus not returning anything. 
		public void levelUp(int amount) {
			strength += amount;
		}
	}
}
