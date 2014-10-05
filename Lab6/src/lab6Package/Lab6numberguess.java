package lab6Package;
import java.util.*;
public class Lab6numberguess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int random = rnd.nextInt(100);
		int count = 7;
		String again = "";
		boolean play = true;
		
		System.out.println("Enter your name");
		String name = scan.next();
	
		while (play == true) {
			System.out.println("Enter a guess");
			int user_input = scan.nextInt();
			if (count == 1) {
				System.out.println(name + ", the number was " + random);
				System.out.println(name + ", you lost! Do you want to play again? (y/n)");
				again = scan.next();
				if ((again.toLowerCase().equals("y"))) {
					count = 7;
					random = rnd.nextInt(100); }
				else {
					System.out.println(name + ", thanks for playing. Good day!");
					play = false; } 
			}
			if (user_input > random) {
				count --;
				System.out.println(name + ", your guess was too high. You have " +count + " guesses left.");}
			else if (user_input < random) {
				count --;
				System.out.println(name + ", your guess was too low. You have " +count + " guesses left.");}
			else if (user_input == random) {
				System.out.println(name + ", you win! Do you want to play again? (y/n)");
				again = scan.next();
				if ((again.toLowerCase().equals("y"))) {
					count = 7;
					random = rnd.nextInt(100); }
				else {
					System.out.println(name + ", thanks for playing. Good day!");
					play = false; } }
			else {
				System.out.println(name + ", the number was " + random);
				System.out.println(name + ", you lost! Do you want to play again? (y/n)");
				again = scan.next();
				if ((again.toLowerCase().equals("y"))) {
					count = 7;
					random = rnd.nextInt(100); }
				else {
					System.out.println(name + ", thanks for playing. Good day!");
					play = false; } 
			}
		}		
	}
}
