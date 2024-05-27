public class SimpleWhile {

	public static void main(String[] args) {
		int sum1 = 50; //Sum
		int topValue = 10; //Number of times to Loop
		int i = 0; //Loop Counter
		
		while (i <= topValue) {
			sum1++;
			i++;
		}
		System.out.println("The final sum is " + sum1);
		
		int sum2 = 0; //Sum 2
		int upperValue = 5; //Number of Values
		int j = 0; //Loop Counter
		
		while (j <= upperValue) {
			sum2+=j;
			j++;
		}
		
		System.out.println("The final sum is " + sum2);
	}

}
