/**
 *  U1-3
 *  StringWork.java
 *  @author longia.1
 *  Purpose: Experimenting with Strings
 *  Test Cases: 2.2 (To check if the decimal is inputted is outputted as a string and decimal)
 */
import java.util.Scanner;
public class StringWork {

	public static void main(String[] args) {
		String string = "There’s a lot to learn with Java programming!"; //String Object
		System.out.println("Your string is: " + string);
		
        int stringLength = string.length(); //Length of String
        System.out.println("The length of your string is: " + stringLength + "\n");
        
        char stringChar = string.charAt(3); //4th character of String
        System.out.println("My letter using charAt() is: " + stringChar);
        
        String stringSub = string.substring(3, 4); //Substring consisting of the letter "r"
        System.out.println("My letter using substring() is: " + stringSub);
        
        int stringGram = string.indexOf("gram"); //The index where the phrase "gram" was found
        System.out.println("The phrase \"gram”\" in our string is found at index: " + stringGram + "\n");
        
        String day1 = "Friday"; //First String to Compare
        String day2 = "friday"; //Second String to Compare
        boolean stringEquals = day1.equals(day2); //Comparison
        System.out.println("The strings \"" + day1 + "\" and \"" + day2 + "\" equal: " + stringEquals + "\n");
        
        Scanner reader = new Scanner(System.in); //Scanner Object
        System.out.print("Enter in a decimal: ");
        double input = reader.nextDouble(); //Decimal Input
        String inputAsString = Double.toString(input); //Input as a String
        System.out.println("My string is " + inputAsString + " and my decimal is " + input + "\n");
        
        reader.nextLine();
        
        System.out.print("Enter in an integer: ");
        String inputInteger = reader.nextLine(); //Integer Input
        int inputToString = Integer.parseInt(inputInteger); //Input as a String
        System.out.println("My string is " + inputInteger + " and my integer is " + inputToString + "\n");
        
        
        Integer ten = 10; //Integer storing 10
        double tenWithDecimals = ten.doubleValue(); //10 as a double
        System.out.println("My original number without decimal places was: " + ten + "\nMy original number with decimal places was: "
        + tenWithDecimals + "\n");
        
        String secondString = "Peter Piper picked a peck of pickled peppers from Mrs. Pott’s Petunia Parlor"; //Initial String
        String secondStringLowercase = secondString.toLowerCase(); //String changed to all lowrcase
        String secondStringZ = secondStringLowercase.replace("p", "z"); //Lowercase String but p's changed to z's
        System.out.println("My original string was: " + secondString + "\nMy updated string was: " + secondStringLowercase + 
        		"\nMy final string was: " + secondStringZ);
        
        
        
        
        
        
	}

}
