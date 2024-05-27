/**
 *  U1-5 P1
 *  QuotientRemainder.java
 *  @author longia.1
 *  Purpose: Calculate quotients and remainders of a set of numbers divided by a divisor
 *  Test Cases: (15, 25, 4) - 3, 4, 5 and 6 as quotients and 0, 1, 2, 3 as remainders. (10 , 20 , 5)
 */
import java.util.Scanner;
public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Indicate the starting number for the dividend‐range: ");
		int firstNum = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Indicate the ending number for the dividend‐range: ");
		int secondNum = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Indicate the divisor to use (specify a number lower than the start of the dividend‐range): ");
		int divisor = scan.nextInt();
		scan.nextLine();
		
		for (int i = firstNum; i <= secondNum; i++) {
			System.out.println("For " + i + "/" + divisor + " Quotient: " + (i / divisor) + " Remainder: " + (i % divisor));
		}

	}

}
