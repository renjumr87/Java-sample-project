import java.util.Scanner;

public class NumberPattern {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a limit");
		
		int limit = sc.nextInt();
		
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
	}
}
