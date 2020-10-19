import java.util.Scanner;

public class FunctionSample {
	public static void main(String ar[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int num1 = sc.nextInt();
		
		System.out.println("Please enter another number");
		
		int num2 = sc.nextInt();
		
		int result = sum(num1,num2);
		
		System.out.println("Result is : " + result);
		
	}
	


static int sum(int firstNumber,int secondNumber) {
	
	int s = firstNumber + secondNumber;
	
	return s;
}

}