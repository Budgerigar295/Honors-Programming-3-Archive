/**
 *  U1-4 Walk 1
 *  U1_4W1 SkillCheck.java
 *  @author longia.1
 *  Purpose:
 *  Test Cases:
 */
public class U1_W41_SkillCheck {

	public static void main(String[] args) {
		double cost = 0.00; //Total Cost
		int items = 0; //Total Items
		double sodaCost = 2.25; //Cost of 1 Soda
		double pizzaCost = 4.50; //Cost of 1 Pizza
		
		System.out.println("Thanks for your soda purchase!");
		
		items = items + 1;
		cost = cost + sodaCost;
		System.out.println("Your total cost is $" + cost + " and you've purchased " + items + " items.");
		
		System.out.println("Thanks for your pizza purchase!");
		
		items = items + 1;
		cost = cost + pizzaCost;
		System.out.println("Your total cost is $" + cost + " and you've purchased " + items + " items.");
	}

}
