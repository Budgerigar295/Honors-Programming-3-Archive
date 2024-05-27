/**
 *  U1-2 Extension
 *  UseRandomUtil.java
 *  Purpose: Experiment with the Random method
 *  @author longia.1
 *  Test Cases: N/A
 *  Methods: next(), nextBoolean(), nextDouble(), nextFloat(), nextGaussian(), nextInt(), nextLong()
 */
import java.util.Random;
public class UseRandomUtil {

	public static void main(String[] args) {
		Random rand = new Random(); //New Random Object
		int random5 = rand.nextInt(5); //Random number between 0 (inclusive) and 5 (exclusive)
		System.out.println("The random number between 0 (inclusive) and 5 (exclusive) is: " + random5);
		int random10 = rand.nextInt(10); //Random number between 0 (inclusive) and 10 (exclusive)
		System.out.println("The random number between 0 (inclusive) and 10 (exclusive) is: " + random10);

	}

}
