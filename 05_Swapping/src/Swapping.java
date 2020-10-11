import java.util.Scanner;

public class Swapping {
	public static void main(String a[]) {
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Please Enter a Number");
		
		
		
		int firstNumber = n.nextInt();
		
		System.out.println("Please Enter another Number");
		
		int secondNumber = n.nextInt();
		
		int temp = firstNumber;
		
		firstNumber = secondNumber;
		
		firstNumber = temp;
		
		System.out.println("First Number is: " + secondNumber);
		
		System.out.println("Second Number is: " + firstNumber);
		
		
		
		
		
		
		
		
	}

}
