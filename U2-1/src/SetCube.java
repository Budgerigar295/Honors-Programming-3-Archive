import java.util.Arrays;
import java.util.Scanner;
public class SetCube {

	 private  static  double[]  populateCube() {
		 double[] cubeArray = new double[10]; //Integer Array
		 for (int i = 0; i < cubeArray.length; i++) {
			 cubeArray[i] = Math.pow(i, 3.0);
		 }
		 
		 return cubeArray;
	 }
	public static void main(String[] args) {
		double[] array = populateCube();
		System.out.println(Arrays.toString(array));
	}

}
