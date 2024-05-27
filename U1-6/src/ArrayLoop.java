import java.util.Arrays;
public class ArrayLoop {

	public static void main(String[] args) {
		int[] myVals = {10, 20, 30, 40, 50}; //List of Integers
		String output = ""; //Final Output String 1
		String output2 = ""; //Final Output String 2
		
		for (int i = 0; i < myVals.length; i++) {
			output = output + myVals[i] + " ";
		}
		System.out.println(output);
		
		int j = 0; //Loop Counter
		while (j < myVals.length) {
			output2 = output2 + myVals[j] + " ";
			j++;
		}
		System.out.println(output2);
		System.out.println(Arrays.toString(myVals));
	}

}
