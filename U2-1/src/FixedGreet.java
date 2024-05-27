import java.util.Scanner;
public class FixedGreet {
	private static void greetUser(String userName, String userYear) {
		System.out.println("Hi " + userName + "! Welcome to NAHS! Good luck in your " + userYear + " year!!");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner Object
		
		System.out.print("Enter your Name: ");
		String userName = scan.nextLine(); //User Name
		
		System.out.print("Enter your School Year: ");
		String userYear = scan.nextLine(); //User Year
		
		greetUser(userName, userYear);
	}

}
