public class SimpleFor {

	public static void main(String[] args) {
		int sum1 = 50; //Sum
		int topValue = 10; //Loop Counter
		
		for (int i = 0; i < topValue; i++ ) {
			sum1 += 1;
			//sum1++;
			//sum1 = sum1 + 1;
		}
		System.out.println("The final value is " + sum1);
		
		int sum2 = 0; //Second Sum
		int upperValue = 5; //Second Loop Counter
		
		for (int i = 0; i <= upperValue; i++) {
			sum2+=i;
			//sum2 = sum2 + i;
		}
		System.out.println("The final value is " + sum2);
	}

}