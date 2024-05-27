import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ReadFromFile {
	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File ("input.txt"); //File Object
		Scanner scan = new Scanner(inputFile); //Scanner Object
		String myString; //String
		
		while (scan.hasNext() ) {
			myString = scan.nextLine();
			System.out.println(myString);
			}
		scan.close();
	}
}
