import java.util.Scanner;

public class HelloSample {

	public static void main(String ar[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Hello World");
		System.out.println("Please Enter Two Numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a+b;
		System.out.println("Result is : " + c);
	}
}