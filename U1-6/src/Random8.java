import java.util.Arrays;
import java.util.Random;
public class Random8 {
	public static void main(String[] args) {
		Random rand = new Random(); // Creates Random object
		
		for (int i = 0; i < 8; i++) {
			System.out.println(rand.nextInt(11 - 0));
		}
	}
}
