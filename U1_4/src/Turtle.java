/**
 *  U1-4
 *  Turtle.java
 *  @author longia.1
 *  Purpose: Query the User for their favorite TMNT Character
 *  Test Cases: Leonardo, Raphaell, Donatello, and Michealangelo - Used to test if the outputs match the inputted character. 
 *  Random Man on Street - Used to test if a non-existent character is detected.
 */
import java.util.Scanner;
public class Turtle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //New Scanner Object
		System.out.print("What is the name of your favorite TMNT Character? ");
		String character = scan.nextLine(); //User's Favorite Character
		
		//Subtask 1
		if (character.equals("Leonardo")) {
			System.out.println("You wear a blue mask");
		} else if (character.equals("Raphaell")) {
			System.out.println("You wear a red mask");
		} else if (character.equals("Donatello")) {
			System.out.println("You wear a purple mask");
		} else if (character.equals("Michealangelo")) {
			System.out.println("You wear a orange mask");
		} else {
			System.out.println("Non-Existent Character");
		}
		System.out.println("Done with Subtask 1.");
		
		//Subtask 2
		if (character.equals("Leonardo")) {
			System.out.println("You wear a blue mask");
		} else if (character.equals("Raphaell")) {
			System.out.println("You wear a red mask");
		} else if (character.equals("Donatello")) {
			System.out.println("You wear a purple mask");
		} else {
			System.out.println("You wear a orange mask");
		}
		System.out.println("Done with Subtask 2.");
		
		//Subtask 3
		if (character.equals("Leonardo")) {
			System.out.println("You wear a blue mask");
		} else if (character.equals("Raphaell")) {
			System.out.println("You wear a red mask");
		} else if (character.equals("Donatello")) {
			System.out.println("You wear a purple mask");
		} else if (character.equals("Michealangelo")) {
			System.out.println("You wear a orange mask");
		} else {
			//None of these Characters were inputted
			//Do Nothing
		}
		System.out.println("Done with Subtask 3.");
		
		//Subtask 4
		String color = ""; //Mask Color
		if (character.equals("Leonardo")) {
			color = "blue";
		} else if (character.equals("Raphaell")) {
			color = "red";
		} else if (character.equals("Donatello")) {
			color = "purple";
		} else {
			color = "orange";
		}
		System.out.println("You wear a " + color + " mask");
		System.out.println("Done with Subtask 4.");
	}

}
