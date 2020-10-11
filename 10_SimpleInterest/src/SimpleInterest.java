import java.util.Scanner;

public class SimpleInterest {
public static void main(String a[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please Enter the Principal Amount");
	
	int P = sc.nextInt();
	
	System.out.println("Please Enter the Rate of Interest");
	
	float R = sc.nextFloat();
	
	System.out.println("Please Enter the Number of Years");
	
	float n = sc.nextFloat();
	
	float SI = (P*R*n)/100;
	
	System.out.println("Your Simple Interest is: " + SI);
}
}
