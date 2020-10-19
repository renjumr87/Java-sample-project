import java.util.Scanner;

public class Continue {
	public static void main(String ar[]) {
		Scanner scan = new Scanner(System.in);
		
		int limit = scan.nextInt();
		for(int i=0;i<limit;i++) {
			System.out.print("Hi");
			if(i == 5) {
				continue;
			}
		}
	}

}
