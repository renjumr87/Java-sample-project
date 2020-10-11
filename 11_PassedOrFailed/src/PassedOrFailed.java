import java.util.Scanner;

public class PassedOrFailed {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Your Mark");
		
		float mark = sc.nextFloat();
		
		if(mark<50) {
			System.out.println("You are Failed");
		}else {
			System.out.println("You are Passed");
		}
	}

}
