import java.util.Scanner;
/**
 *  U1-4 P1
 *  ElevatorSim.Java
 *  @author longia.1
 *  Purpose: Get the user to a certain floor they want to get to.
 *  Test Cases: 0 (Floor doesn't exist), 1 (Travelling to floor 1), 5 (Travelling to floor 5). 13 (There is no 13th floor), 15 (Travelling to floor 14), 20 (Travelling to floor 19), 21 (Floor doesnt exist)
 */
public class ElevatorSim {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner Object
		
		final int FORBIDDEN_FLOOR =  13; //Floor that cannot be travelled to
		final int MAX_FLOOR = 20; //Highest floor that can be travelled to
		
		System.out.print("Which floor would you like to travel to? ");
		int floor = scan.nextInt(); //User's Floor
		scan.nextLine();
		
		if (floor >= 1 && floor <= MAX_FLOOR) {
			if (floor == FORBIDDEN_FLOOR) {
				System.out.println("There is no " + FORBIDDEN_FLOOR + "th floor");
			} else {
				if (floor > FORBIDDEN_FLOOR) {
					floor = floor - 1;
				}
				System.out.println("The elevator will travel to the actual floor: " + floor);
			}
	
		} else {
			System.out.println("Not a valid floor.");
		}
	}

}
