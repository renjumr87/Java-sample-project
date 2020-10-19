import java.util.Scanner;

public class PatternPrinting {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a limit");
		
		int limit = sc.nextInt();
		
		for(int i=1;i<limit;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
