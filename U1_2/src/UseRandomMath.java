/**
 *  U1-2 Extension 1 Part 2
 *  UseRandomMath.java
 *  Purpose: Experiment with the Math.random method
 *  @author longia.1
 *  Test Cases: N/A
 *  Math.random() - Generates a positive number between 0.0 and 1.0 (returns a double datatype) and accepts no parameters.
 */
public class UseRandomMath {

	public static void main(String[] args) {
		double firstRand = Math.random(); //Random double between 0.0 (inclusive) and 1.0 (exclusive)
		System.out.println("The double random number between 0 (inclusive) and 1 (exclusive) is: " + firstRand);
		int secondRand = (int) (Math.random()*5.0); //Random integer between 0 (inclusive) and 5 (exclusive)
		System.out.println("The integer random number between 0 (inclusive) and 5 (exclusive) is: " + secondRand);
	}

}
