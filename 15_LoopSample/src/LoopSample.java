import java.util.Scanner;

public class LoopSample {
	public static void main(String a[]) {
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter a limit to print Numbers");
		
		int limit = n.nextInt();
		
		for(int i=0;i<=limit;i++) {
			System.out.println(i);
		}
	}

}
