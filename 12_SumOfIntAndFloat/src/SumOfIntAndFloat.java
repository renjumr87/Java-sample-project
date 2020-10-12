import java.util.Scanner;

public class SumOfIntAndFloat {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer number");
		
		int integerNumber = sc.nextInt();
		
		System.out.println("Please enter a floating number");
		
		float floatingNumber = sc.nextFloat();
		
		float result = integerNumber + floatingNumber;
		
		System.out.println("Result is: " + result);
	}
}
