package lab6Package;
import java.util.*;
public class Lab6EC {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int range = 0;
		int guess;
		int count = 0;
		int reset = 0;
		int lower_bound = 0;
		int i = 1;
		boolean valid = false;
		
		System.out.println("Enter a range");
		System.out.println("Choose 1 for: 1-10");
		System.out.println("Choose 2 for: 1-100");
		System.out.println("Choose 3 for: 1-1000");
		System.out.println("Choose 4 for: 1-10000");
		System.out.println("Choose 5 for: Custom Range");
		int input = sc.nextInt();
		while (valid == false) {
			if (input==1) {
				range = 10;
				valid = true;}	
			else if (input==2) {
				range = 100;
				valid = true;}
			else if (input==3) {
				range = 500;
				valid = true;}
			else if (input==4) {
				range = 1000;
				valid = true;}
			else if (input == 5) {
				System.out.println("Enter your lower bound");
				lower_bound = sc.nextInt(); 
				System.out.println("Enter your upper bound");
				range = sc.nextInt(); 
				System.out.println("Your range is " + lower_bound + ", " + range);  
				valid = true;}	
			else {
				System.out.println("Enter a range");
				input = sc.nextInt(); 
				}}
		
		int number = (rand.nextInt((range - lower_bound) + 1) + lower_bound);
		
		int custom_test = Math.abs(lower_bound) + Math.abs(range);
		while (custom_test != 1) {
			i++;
			custom_test = custom_test/2;
			count = i; }
		reset = count;
		
		System.out.println(number + ", You have " +count+ " guesses");
		
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
	                     number = (rand.nextInt((range - lower_bound) + 1) + lower_bound); }}
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
			                   number = (rand.nextInt((range - lower_bound) + 1) + lower_bound); }
			       		 else if ((play.toLowerCase()).equals("no")) {
			       			   System.out.println("Thanks for playing!");
			       			   System.exit(1); }}}
	       					       					  
	       		  
		
		
	}
}