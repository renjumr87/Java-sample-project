import java.util.Scanner;

public class SumofTwoNumbers {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Two Numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("Result is : " + sum);
	}

}
