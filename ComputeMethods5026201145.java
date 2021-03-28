import java.lang.Math;
import java.util.Random;

public class ComputeMethods5026201145 {

	public double degreesF = 0.0;
	public int a = 0;
	public int b = 0;

	public double fToC(double degreesF){
		double degreesC =  5.0/9.0 * (degreesF - 32.0);
		return degreesC;
	}
	public double hypotenuse(int a, int b){
		double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		return c;
	}
	public int roll(){
		Random random = new Random();
		int randomInteger1 = random.nextInt(6) + 1;
		int randomInteger2 = random.nextInt(6) + 1;
		int sum = randomInteger1 + randomInteger2;
		return sum;
	}

}