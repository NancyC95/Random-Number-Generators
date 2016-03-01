import java.util.Random;
import java.util.Scanner;

public class NumberGuessingwithaCounter {
	public static void main(String[] args){
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		int guess, tries = 0;
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("This is a better number guessing game... guess a number from 1 - 10: ");
		guess = keyboard.nextInt();
		tries = 1;
		
		while (guess != x){
			System.out.println("Wrong! Keep guessing: ");
			guess = keyboard.nextInt();
			tries++;
		}
		if (guess == x)
			System.out.println("Yay you got it right, the number was " + x);
			System.out.println("Number of tries: " + tries);
	
		
	}

}
