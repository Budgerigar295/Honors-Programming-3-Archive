/**
 *  U1-4 Extenstion 1
 *  NumCheckStrict.java
 *  @author longia.1
 *  Purpose:
 *  Test Cases:
 */
import java.util.Scanner;
public class NumCheckStrict {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner Object
		System.out.print("Enter 3 Integers seperated by a space: ");
		String output; //Part of final output string
		
		int firstInt = scan.nextInt(); //First Integer
		int secondInt = scan.nextInt(); //Second Integer
		int thirdInt = scan.nextInt(); //Third Integer
		scan.nextLine();
		
		if (firstInt < secondInt && secondInt < thirdInt) {
			output = "increasing";
		} else if(thirdInt < secondInt && secondInt < firstInt) {
			output = "decreasing";
		} else {
			output = "neither increasing or decreasing";
		}
		
		System.out.println("Your numbers are " + output);
	}

}
