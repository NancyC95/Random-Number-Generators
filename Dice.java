import java.util.Random;
public class Dice {
	public static void main(String[] args){
		Random r = new Random();
		int x = 1 + r.nextInt(6);
		int y = 1 +r.nextInt(6);
		
		System.out.println("Rolling dice... \nRoll #1: " + x + "\nRoll #2: " + y);
		System.out.println("The total is: " + (x + y) );
		
		
	}

}
