/**
 *  U1-2 P1
 *  APIBasic.java
 *  Purpose: To get a grasp of the Java API
 *  @author longia.1
 *  Test Cases: (3,4, 3.14, 2.2) - Testing to see if averages are same between both data types and result in a decimal.
 */
import java.util.Scanner;
public class APIBasic {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); //Scanner Object
		
		//Get Integers
		System.out.print("Enter in 2 numbers: ");
		int firstInt = reader.nextInt(); //First Integer
		int secondInt = reader.nextInt(); //Second Integer
		reader.nextLine();
		
		//Get Decimals
		System.out.print("Enter in 2 decimals: ");
		double firstDecimal = reader.nextDouble(); //First Decimal
		double secondDecimal = reader.nextDouble(); //Second Decimal
		reader.nextLine();
		
		//Max Value
		int maxValue = Math.max(firstInt, secondInt); //Max Value of integers
		
		//Averages
		double averageDouble = (firstInt + secondInt)/2.0; //Average of integers as a double
		float averageFloat = (firstInt + secondInt)/2f; //Average of integers as a float
		
		//Average Rounding
		long averageDoubleRounded =  Math.round(averageDouble); //Average of integers as a double but rounded
		int averageFloatRounded =  Math.round(averageFloat); //Average of integers as a float but rounded
		
		//Squaring
		double intSquared = Math.pow(firstInt, 2.0); //First Integer Squared
		
		//Decimal Stuff
		int decimalDivision = (int) (secondDecimal/firstDecimal); //Second Decimal divided by First Decimal with the result 
		double radius = Math.pow(secondDecimal, 2.0); //Radius of the Circle squared using the Second Decimal Inputted
		double circleArea = (Math.PI*radius); //Area of Circle
		
		//Output Statements
		System.out.println("The maximum of your integers is: " + maxValue);
		
		System.out.println("The average of your integers is: " + averageDouble);
		System.out.println("The average of your integers is: " + averageFloat);
		
		System.out.println("The average of your integers rounded is: " + averageDoubleRounded);
		System.out.println("The average of your integers rounded is: " + averageFloatRounded);
		
		System.out.println("The first integer rounded to the second power is: " + intSquared);
		
		System.out.println("The result of dividing the first decimal by the second decimal is: " + decimalDivision);
		
		System.out.println("The area using " + secondDecimal + " as the radius is: " + circleArea);
		
	}

}
