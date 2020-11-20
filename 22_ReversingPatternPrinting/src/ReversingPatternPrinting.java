import java.util.Scanner;

public class ReversingPatternPrinting {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Limit");
		int limit = sc.nextInt();
		
		for(int i=0;i<=limit;i++) {
			for(int j=limit;j>i;j--) {
				System.out.print("*");
			}
			
			System.out.println("\n");
		}
	}
}
