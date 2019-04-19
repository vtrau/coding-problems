import java.util.Random;

public class EstimatePi {
	public static double graph(int randomPoints) {
		//insideCircle is the number of points that would be located inside a circle in a graph
		int insideCircle=0;
		Random random = new Random();

		//randomPoints is the number of points that would be placed randomly on graph
		for (int i = 0; i < randomPoints; i++) {

			//x and y is a random value between 0 and 1, which would make a point on a graph
			//(x,y)
			double x = random.nextDouble();
			double y = random.nextDouble();

			//this is a equation of a circle
			double point = x * x + y * y;

			//if point is less than one, the point would be inside the circle
			if (point <= 1) {
				insideCircle++;
			}

		}
		//the area of a circle is A = πr^2.
		//Because the radius being used to generate the circle is 1, A = π.
		//Because the generated x's and y's are between 0 and 1, not -1 and 1, we are only using 1/4 of a graph. A/4 = π/4
		//this means we have to multiply our equation by 4 to get the correct estiamted answer 
		double estPi = 4.0 * insideCircle/randomPoints;
		return estPi;
	}
	public static void main(String[] args) {
		System.out.println(graph(1000));
	}
}
