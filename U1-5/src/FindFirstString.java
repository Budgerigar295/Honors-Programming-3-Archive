/**
 *  U1-5 P5
 *  FindFirstString
 *  @author longia.1
 *  Purpose: Find the first occurance of a substring in a larger string
 *  Test Cases: Call of Duty (o, 5). Geometry (t, 5). Skill (t, not found)
 */
import java.util.Scanner;
public class FindFirstString {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //New Scanner Object
		
		System.out.print("Input a string: ");
		String inputString = scan.nextLine(); //Input String
		
		System.out.print("Input the character you want to find: ");
		String inputChar= scan.nextLine(); //Input character to Find
		
		int i = 0; //Loop Counter
		int stringLocation = -1; //Location of character in string
	    boolean done = false; //Sentinel
		
		while(!done && i < inputString.length()) {
			if (inputString.substring(i, i + 1).equals(inputChar.substring(0))) {
				stringLocation = i;
				done = true;
			} else {
				i++;
			}
		}
		
		
		if (stringLocation != -1) {
			System.out.println("Your character was found at position " + stringLocation);
		} else {
			System.out.println("Your character was not found in the string.");
		}
		
	}
}
