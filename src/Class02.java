import java.util.Scanner;


public class Class02 {
	public static void main(String args[]) {
	Scanner radius = new Scanner(System.in);
	double pi = 3.141592;
	double radiuss = 2;
	System.out.println(radiuss * radiuss * radiuss * pi + " inches cubed");
	System.out.println("Enter the radius here:");
	double rad = radius.nextDouble();
	System.out.println(rad * rad * rad * pi + " inches cubed");

	}
}