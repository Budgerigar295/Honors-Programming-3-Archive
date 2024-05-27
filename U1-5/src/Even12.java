
public class Even12 {

	public static void main(String[] args) {
		//With While Loop
		int i = 1; //Loop Counter
		
		while (i <= 100) {
			if (i % 12 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		//With For Loop
		String output = ""; //Final Output String
		
		for (int j = 0; j <= 100; j++) {
			if (j % 12 == 0) {
				output = output + j + " ";
			} 
		}
		System.out.println(output);
	}

}
