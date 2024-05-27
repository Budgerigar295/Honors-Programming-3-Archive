/**
 *  U1-5 P2
 *  ConvertCtoF.java
 *  @author longia.1
 *  Purpose: Convert Celsius to Farenheit
 *  Test Cases: N/A
 */
public class ConvertCtoF {

	public static void main(String[] args) {
		System.out.println("Celsius          Fahrenheit\n" + "‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
		
		for (int i = 0; i <= 10; i++) {
			System.out.println((i*10) + "                        " + (((i*10)*9/5) + 32));
		}
	}

}
