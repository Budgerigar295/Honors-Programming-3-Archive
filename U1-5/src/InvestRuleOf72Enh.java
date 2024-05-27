/**
 * U1-5 Extension 2
 * InvestRuleOf72.java
 * @author longia.1
 * Purpose: Calculate the number of periods to double an initial principal
 * Test Cases: 100 and 4 (18, 18 Periods (Rule of 72), 17.5 Periods (Rule of 70)), 
 * 700 and 9 (9, 8 Periods (Rule of 72)),
 * 174.5 and 17 (5, 4.24 Periods (Rule of 72), 4.41 Periods (Rule of 75))
 */
import java.util.Scanner;
public class InvestRuleOf72Enh {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner Object
		
		System.out.print("Enter a starting balance: ");
		double balanceInitial = scan.nextDouble(); //Initial Balance
		scan.nextLine();
		
		System.out.print("Enter the interest rate (as a percentage): ");
		double percentInterest = (scan.nextDouble())/100; //Percent Interest
		
		int rule = 72; //Rule
		if (percentInterest > 0.08) {
			rule+=(((percentInterest*100) - 8)/3);
		} else if (percentInterest < 0.08) {
			rule-=((8 - (percentInterest*100))/3);
		}
		scan.nextLine();
		
		int period = 1; //Current Period
		double balance = (balanceInitial*percentInterest)+ balanceInitial; //Balance
		boolean done = false; //Sentinel
		
		while (!done) {
			if (balance < (balanceInitial*2)) {
				System.out.println("At the end of Period " + period + " the current balance "
						+ "is $" + balance);
				period++;
				balance = (balance*percentInterest)+ balance;
			} else {
				done = true;
			}
		}
		
		System.out.println("It took " + period + " periods to double your money");
		System.out.println("\nThe Rule of 72 predicted that it would take " 
		+ (72/(percentInterest*100)) + " number of periods to double your money");
		System.out.println("The adjusted Rule of " + rule + " predicted that it would take " 
		+ (rule/(percentInterest*100)) + " number of periods to double your money");
		
	}

}
