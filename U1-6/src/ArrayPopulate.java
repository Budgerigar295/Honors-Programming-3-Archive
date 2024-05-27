import java.util.Arrays;
public class ArrayPopulate {

	public static void main(String[] args) {
		int[] myInts = new int[10]; //Integer Array
		
		for (int i = 0; i < myInts.length; i++) {
			myInts[i] = (i * i);
		}
		
		int j = 0; //Loop Counter
		while (j < myInts.length) {
			System.out.println(myInts[j]);
			j++;
		}
	}

}
