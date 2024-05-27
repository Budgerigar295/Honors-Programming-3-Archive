/**
 * U1-2 Walk1
 * Easy.java
 * Purpose: Query the user for their favorite color and favorite number and generate their response.
 * Longia
 * Test Cases: N/A
 */
import java.util.Scanner;
public class Easy {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); //Declare Scanner Object
		
		System.out.print("What is your favorite color? ");
		
		String color = reader.nextLine(); //User's Favorite Color
		
		System.out.print("What is your favorite number? ");
		
		int number = reader.nextInt(); //User's Favorite Number
		
		reader.nextLine(); //Consumes the newline character
		
		System.out.println("Your favorite color is " + color + " and your favorite number is " + number + "!");
		
		
	}

}
