/**
 *  U1-6 P3
 *  BasicArrayString.java
 *  @author longia.1
 *  Purpose: Query the user for their class listing and their favorite classes
 *  Test Cases: (3, AP Physics, AP English 11, AP Calculus A-B) - Class Listing is AP Physics, AP English 11 and AP Calculus A-B
 *  (6, AP Physics, AP English 11, AP Calculus A-B, AP Computer Science, AP Government and Politics, Cybersecurity)
 *  Class Listing is AP Physics, AP English 11, AP Calculus A-B, AP Government and Politics, and Cybersecurity
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class BasicArrayString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner Object
		System.out.print("How many classes are you taking this semester? ");
		int classNum = scan.nextInt(); //Number of classes user is taking
		scan.nextLine();
		
		String[] classes = new String[classNum];
		
		for (int i = 0; i < classes.length; i++) {
			System.out.print("Enter the title for class " + (i + 1) + ": ");
			classes[i] = scan.nextLine();
		}
		
		System.out.println("Your class listing is: " + Arrays.toString(classes));
		
		String output = ("Your class listing is: ");
		for (int i = 0; i < classes.length; i++) {
			output = output + classes[i] + ", ";
		}
		System.out.println(output);
		
		Random rand = new Random();
		
		boolean done = false; //Sentinel
		int guess = 0; //Number of Guesses
		
		while(!done) {
			System.out.print("Is your favorite class: " + classes[rand.nextInt(classes.length)] + "? (y/n) ");
			if (scan.nextLine().equals("y")) {
				done = true;
			}
			guess++;
		}
		
		System.out.println("It took " + guess + " guesses to guess your favorite class.");
		
	}

}
