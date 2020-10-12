import java.util.Scanner;

public class PrintEvenNumbersWithForLoop {
	public static void main(String ar[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter a limit");
		
		int limit = scan.nextInt();
		
		for(int i=0;i<limit;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
