import java.util.Scanner;

public class SumOfArray {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a limit\n");
		
		int limit = sc.nextInt();
		
		int[] values = new int[100];
		
		int sum = 0;
		
		/* Recieve values into the array */
		
		System.out.println("Please enter values\n");
		
		for(int i=0;i<limit;i++) {
			values[i] = sc.nextInt();			
		}
		
		/* Calculating the sum of array */
		
		for(int i = 0; i < limit; i++) {
			sum = sum + values[i];
		}
		
		//output the sum of array
		
		System.out.println("The result is: " + sum);
	}
}