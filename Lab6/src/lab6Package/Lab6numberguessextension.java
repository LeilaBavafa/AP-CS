package lab6Package;
import java.util.*;
public class Lab6numberguessextension {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int range = 0;
		int guess;
		int count = 0;
		int reset = 0;
		boolean valid = false;
		
		System.out.println("Enter a range");
		System.out.println("Pick 1 for: 1-10");
		System.out.println("Pick 2 for: 1-100");
		System.out.println("Pick 3 for: 1-500");
		System.out.println("Pick 4 for: 1-1000");
		int input = sc.nextInt();
		while (valid == false) {
			if (input==1) {
				reset = 4;
				range = 10;
				count = 4; 
				valid = true;}	
			else if (input==2) {
				reset = 7;
				range = 100;
				count = 7; 
				valid = true;}
			else if (input==3) {
				reset = 9;
				range = 500;
				count = 9; 
				valid = true;}
			else if (input==4) {
				reset = 10;
				range = 1000;
				count = 10; 
				valid = true;}
			else {
				System.out.println("Enter a range");
				input = sc.nextInt(); } }
		
		int number = rand.nextInt(range);
		
		System.out.println(number);
		
		String play = "false";
		
		while (count != 0) {
		System.out.println("Enter a guess");
           guess = sc.nextInt();
		   System.out.println("You guess: " + guess);
		   if (guess > number) {
	              count--;      
	              System.out.print("Your guess is too high. "); 
	              System.out.println(("You have ") + count + (" guess(es) left")); }
	       else if (guess < number) {
	              count--;      
	              System.out.print("Your guess is too low. "); 
	              System.out.println(("You have ") + count + (" guess(es) left"));}
	       else if (guess == number) {
	              count--;      
	              System.out.println("Nailed it!");
	              System.out.println("Do you want to play again? (Yes or No)"); 
	       		  play = sc.next();
	              if ((play.toLowerCase()).equals("yes")) {
	                     count = reset;
	                     number = rand.nextInt(range); }}
	       		  else if ((play.toLowerCase()).equals("no")) {
	       			  	 System.out.println("Thanks for playing!");
	       			  	 System.exit(1); }
			      if (count == 0) {
			    	   	 System.out.println("You ran out of guesses!"); 
			    	   	 System.out.println("The number was " + number);
			    	   	 System.out.println("Do you want to play again? (Yes or No)"); 
			       		 play = sc.next();
			             if ((play.toLowerCase()).equals("yes")) {
			                   count = reset;
			                   number = rand.nextInt(range); }
			       		 else if ((play.toLowerCase()).equals("no")) {
			       			   System.out.println("Thanks for playing!");
			       			   System.exit(1); }}}
	       					       					  		
	}
}