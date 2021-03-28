public class TestClass5026201145 {

	public static void main (String args[]) {
		ComputeMethods5026201145 comp = new ComputeMethods5026201145();
		
		comp.degreesF = 104.0;
		double degreesF = comp.degreesF;
		comp.fToC(degreesF);
		System.out.println("Temp in celsius is " + comp.fToC(degreesF));

		comp.a = 4;
		int a = comp.a;
		comp.b = 5;
		int b = comp.b;
		comp.hypotenuse(a,b);
		System.out.println("Hypotenuse is " + comp.hypotenuse(a,b));

		comp.roll();
		System.out.println("The sum of the dice is " + comp.roll());
	}
}