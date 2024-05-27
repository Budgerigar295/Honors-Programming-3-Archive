import java.util.Scanner;
public class PrintLarger {
	private static void findLargerNum(int firstValue, int secondValue) {
		if (firstValue >= secondValue) {
			System.out.println(firstValue + " is the largest number out of the two numbers.");
		} else {
			System.out.println(secondValue + " is the largest number out of the two numbers.");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner Object
		
		System.out.print("Enter in a Number: ");
		int firstNum = scan.nextInt(); //First Number
		scan.nextLine();
		
		System.out.print("Enter in another Number: ");
		int secondNum = scan.nextInt(); //Second Number
		scan.nextLine();
		
		findLargerNum(firstNum, secondNum);
	}
}
