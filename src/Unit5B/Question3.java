package Unit5B;

public class Question3 {
	public class BoolTest{
		private int one;
		public BoolTest(int newOne) {
			one = newOne;
		}
		
		public int getOne() {
			return one;
		}
		
		public boolean isGreater(BoolTest other) {
			/* missing code */
			
			boolean correct;
			
			
			//Since a BoolTest object can access its private instance variable, and the getOne() method being public
			//all three of the expressions will successfully yield a correct comparison
			boolean first = one > other.one;
			boolean second = one > other.getOne();
			boolean third = getOne() > other.one;
			
			if(first == true && second == true && third == true) {
				correct = true;
				return correct;
			}
			else {
				correct = false;
				return false;
			}
		}
	}
}
