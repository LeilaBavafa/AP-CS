package lab6Package;
import java.util.Scanner;
public class Lab6wordsplitter {
	/**
* @param args
*/
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("please enter a word:");
		String word_1 = user_input.nextLine();
		for (int count = 0;count < word_1.length(); count++){
			System.out.println(word_1.charAt(count));
		}
	}
}

