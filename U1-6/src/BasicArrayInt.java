/**
 *  U1-6 P2
 *  BasicArrayInt.java
 *  @author longia.1
 *  Purpose: Create an array of 8 integers from an input file
 *  Test Cases: ("1 2 25 9 2 8 85 5 10 14 19 3 46") - 1, 2, 25, 9, 2, 8, 85, 5  (More than 8 integers yields 8 integers)
 *  ("3 8 1 9 5 3 9 6") - 3 8 1 9 5 3 9 6 (Yields exactly 8 from 8 integers)
 *  ("1 2 3 4 5") - 1, 2, 3, 4, 5, 0, 0, 0 (Still works with less than 8 integers in the input file)
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class BasicArrayInt {

	public static void main(String[] args) throws FileNotFoundException {
		int[] arrayInt = new int[8]; //Integer Array
		File inputFile = new File ("array integers.txt"); //File Object
		Scanner scan = new Scanner(inputFile); //Scanner Object
		
		int i = 0; //Loop Counter
		while (scan.hasNextInt() && i < arrayInt.length) {
			arrayInt[i] = scan.nextInt();
			i++;
			}
		scan.close();
		
		System.out.println("The contents of the array using the Arrays.toString() method is: " + Arrays.toString(arrayInt));
		
		String output = "The contents of the array using a loop is: ";
		for (int j = 0; j < arrayInt.length; j++) {
			output = output + arrayInt[j] + " ";
		}
		System.out.println(output);
	}

}
