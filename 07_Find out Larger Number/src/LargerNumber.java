import java.util.Scanner;

public class LargerNumber {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a Number");
		
		int num1 = sc.nextInt();
		
		System.out.println("Please Enter another Number");
		
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println(" Greater Number is: " + num1);
		}else {
			System.out.println("Greater Number is: " + num2);
		}
	}
}
