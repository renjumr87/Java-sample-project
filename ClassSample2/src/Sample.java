import java.util.Scanner;

public class Sample {
	public static void main (String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		Sum obj1 = new Sum();
		
		Sum obj2 = new Sum();
		
		System.out.println("Please enter a number");
		
		int num1 = sc.nextInt();
		
		System.out.println("Please enter next number");
		
		int num2 = sc.nextInt();
		
		obj1.calculateSum(num1, num2);
		
		obj1.displaySum();
		
		System.out.println("Please enter a number");
		
		int num3 = sc.nextInt();
		
		System.out.println("Please enter next number");
		
		int num4 = sc.nextInt();
		
		obj2.calculateSum(num3, num4);
		
		obj2.displaySum();
		
	}

}
