/**
 *  U1-5 P6
 *  CalcPurchases.java
 *  @author longia.1
 *  Purpose: Calculate how much money the user spent
 *  Test Cases: (0.10, 2, 5, 10, 0 - 5.67 and 18.7). (0.75, 2, 4, 6, 8, 0 - 5 and 35), (0, 0 - You bought nothing.).
 */
import java.util.Scanner;
public class CalcPurchases {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner Object
		
		System.out.print("Enter the tax amount (as a decimal): ");
		double tax = scan.nextDouble(); //Tax
		scan.nextLine();
		
		double totalAmount = 0.00; //Final Amount to Pay
		double cost = -1;
		int count = 0; //How many items currently in hand
		while(cost !=0) {
			System.out.print("Enter your item cost (0 to quit): ");
			cost = scan.nextDouble();
			scan.nextLine();
			
			if (cost != 0) {
				totalAmount +=cost;
				count++;
			} 
		}
		
		if (totalAmount != 0) {
			double average = (totalAmount/count); //Average Cost
			double totalCost = (totalAmount * tax) + totalAmount; //Total Cost
			
			System.out.println("You purchased " + (count) + " items with an average cost of $" + average + " (before tax) "
					+ "and a total cost (with tax) of $" + totalCost + ".");
		} else {
			System.out.println("You bought nothing.");
		}
		
	}

}
