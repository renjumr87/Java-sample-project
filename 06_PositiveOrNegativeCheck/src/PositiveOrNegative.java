import java.util.Scanner;

public class PositiveOrNegative {
	
	public static void main(String a[]) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("Please Enter a Number");
		
		int number = num.nextInt();
		
		if(number<0) {
			System.out.println("Number is Negative");
		}else {
			System.out.println("Number is Positive");
		}
	}
}
