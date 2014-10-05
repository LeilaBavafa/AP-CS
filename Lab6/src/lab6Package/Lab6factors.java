package lab6Package;
import java.util.*;
public class Lab6factors {
	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int userNumber = sc.nextInt();
		int i = 2;
		boolean run = true;
		boolean one = true;
		String answer = "";
		String append = "";
		
		while (run == true) {
			while (userNumber%i == 0) {
				append = Integer.toString(i);
				if (one == true) {
					answer = answer +append; 
					one = false; }
				else {
					answer = answer + " * " + append;
				}
				userNumber = userNumber/i;}
			if (userNumber%i != 0) {
					i++;	
				} 
			if (userNumber == 1) {
				run = false;
			}
		}
		System.out.println("The factors are: " + answer);
	}
}