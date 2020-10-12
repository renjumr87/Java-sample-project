import java.util.Scanner;

public class SumOfN {
	public static void main(String ar[]) {
		Scanner n = new Scanner(System.in);
		
		System.out.println("Please Enter a Limit");
				
		int limit = n.nextInt();
		int sum = 0;
		
		for(int i=0;i<=limit;i++) {
			 sum = sum+i;
		}
		
		System.out.println("Result is: " + sum);
		
		
	}

}
