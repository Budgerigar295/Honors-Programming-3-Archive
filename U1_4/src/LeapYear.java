/**
 *  U1-4 P2
 *  LeapYear.java
 *  @author longia.1
 *  Purpose: Check if a year is a leap year
 *  Test Cases: 1600 (1600 is a leap year.), 1840 (1840 is a leap year.) , 2025 (2025 is not a leap year.), 1700 (1700 is not a leap year.)
 */
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner Object
		String output; //Part of final output string
		
		System.out.print("Enter in a year: ");
		int year = scan.nextInt();
		scan.nextLine(); //User's Year
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					output = "";
				} else {
					output = "not";
				}
			} else {
				output = "";
			}
		} else {
			output = "not ";
		}
		
		System.out.println(year + " is " + output + "a leap year.");

	}

}
