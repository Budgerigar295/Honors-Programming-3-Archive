/**
 *  U1-4 W2
 *  MiniEx.java
 *  @author longia.1
 *  Purpose: Practice using Conditional Statements
 *  Test Cases: 1, 2, 60 (Check if "Johnny Appleseed rules" and "It's a new hour" show). 2, 1, 40 (Check if "It's a Citrus Day" and "No Hour Change" can appear)
 */
import java.util.Scanner;
public class MiniEx {

	public static void main(String[] args) {
		//Mini-Exercise 1
		Scanner scan = new Scanner(System.in); //New Scanner Object
		
		System.out.print("Input how many Oranges you have: ");
		int oranges = scan.nextInt(); //Number of Oranges
		scan.nextLine();
		
		System.out.print("Input how many Apples you have: ");
		int apples = scan.nextInt(); //Number of Apples
		scan.nextLine();
		
		if (oranges > apples) {
			System.out.println("It's a citrus day!");
		} else {
			System.out.println("Johnny Appleseed rules!");
		}
		
		//Mini-Exercise 2
		System.out.print("Enter in a minute value: ");
		int minute = scan.nextInt(); //Minute Inputted
		scan.nextLine();
		
		if (minute % 60 == 0) {
			System.out.println("It's a new hour.");
		} else {
			System.out.println("No Hour Change.");
		}
	}

}
