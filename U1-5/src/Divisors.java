/**
 *  U1-5 P3
 *  Divisors.java
 *  @author longia.1
 *  Purpose: Find which divisors can divide an inputted numbers.
 *  Test Cases: 10 (1, 2, 5, 10, 4), 25, (1, 5, 25 , 3), 100 (1, 2, 4, 5, 10, 25, 50, 100, 9), 21 (1, 21)
 */
import java.util.Scanner;
public class Divisors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to find all divisors: ");
		int num = scan.nextInt(); //Inputted Number
		scan.nextLine();
		int count = 0; //Number of Divisors
		String output = "Divisors are: ";
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				output = output + i + " ";
				count++;
			}
		}
		System.out.println(output + "\nThere are " + count + " divisors.");
	}
}
