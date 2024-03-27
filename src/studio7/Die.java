package studio7;

public class Die {

	private int sides;
	
	public Die(int n) {
		sides = n;
	}
	
	public int Roll() {
		return (int)(Math.random()*sides) + 1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1 = new Die(6);
		System.out.println("you rolled a: " + d1.Roll() );
		

	}

}
