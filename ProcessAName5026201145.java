import java.util.Scanner;

public class ProcessAName5026201145{
	public static void main(String args[]){
	
	Scanner in = new Scanner(System.in);
	System.out.println("Type your name: ");
	String name = in.nextLine();

	int idx1 = name.indexOf(' ');
	System.out.println(idx1);
	
	String last = name.substring(idx1 + 1);
	System.out.println("Your name is: " + last + ", " + name.charAt(0));
	
	}
}

