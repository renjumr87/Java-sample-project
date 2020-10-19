import java.util.Scanner;

public class SumofOddNumbers {
	public static void main(String ar[]) {
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Please enter a limit");
			
			int limit = sc.nextInt();
			
			int sum =0;
			
			for(int i=0;i<=limit;i++) {
				System.out.println(i);
				sum=sum+i;
			}
			
			System.out.println(sum);
		}
	}

}
