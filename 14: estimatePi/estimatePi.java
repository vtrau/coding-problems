import java.util.Random;

public class estimatePi {
	public static double graph(int randomPoints) {
		int insideCircle=0;
		Random random = new Random();
		for (int i = 0; i < randomPoints; i++) {
			double x = random.nextDouble();
			double y = random.nextDouble();
			double point = x * x + y * y;
			if (point <= 1) {
				insideCircle++;
			}

		}
		double estPi = 4.0 * insideCircle/randomPoints;
		return estPi;
	}
	public static void main(String[] args) {
		System.out.println(graph(1000));	
	}
}
