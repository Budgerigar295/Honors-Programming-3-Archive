/**
 *  U1-5 P4
 *  FindFirstChar.java
 *  @author longia.1
 *  Purpose: Find a character in a string when it first appears
 *  Test Cases: pancake (a, 1), zero, (z, 0), wifi (e, not found)
 */
import java.util.Scanner;
public class FindFirstChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //New Scanner Object
		
		System.out.print("Input a string: ");
		String inputString = scan.nextLine(); //Input String
		
		System.out.print("Input the character you want to find: ");
		char inputChar = scan.nextLine().charAt(0); //Input Character
		
		int i = 0; //Loop Counter
		int charLocation = -1; //Location of character in string
		boolean done = false; //Sentinel
		
		while(!done && i < inputString.length()) {
			if(inputString.charAt(i) == inputChar) {
				done = true;
				charLocation = i;
			} else {
				i++;
			}
		}

		if (charLocation != -1) {
			System.out.println("Your character was found at position " + charLocation);
		} else {
			System.out.println("Your character was not found in the string.");
		}
	}

}
