import java.util.Arrays;
public class U1_6Walk1 {
	public static void main(String[] args) {
		int[] myNums = new int[3]; //Integer Array
		myNums[0] = 25;
		myNums[1] = 30;
		myNums[2] = 35;
		System.out.println(myNums[0]);
		
		String[] breakfast = {"Bacons", "Eggs", "Waffles", "Muffins", "Coffee"}; //String Array of Breakfast Items
		System.out.println(breakfast[4]);
		
		int arrayLength = breakfast.length; //Array of Breakfast Array
		System.out.println("The number of elements in my array is: " + arrayLength);
		System.out.println(Arrays.toString(breakfast));

	}
}
