import java.util.Scanner;

public class AverageOfThreeNumbers {
	
	public static void main(String ar[]) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Please Enter Three Numbers Subsequently");
		
		int num1 = number.nextInt();
		
		int num2 = number.nextInt();
		
		int num3 = number.nextInt();
		
		int average = (num1+num2+num3)/3;
		
		System.out.println("Average is: " + average);
		
	}
	
	

}
