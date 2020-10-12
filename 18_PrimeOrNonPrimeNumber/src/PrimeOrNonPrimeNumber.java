import java.util.Scanner;

public class PrimeOrNonPrimeNumber {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int number = sc.nextInt();
		int flag = 0;
		
		for(int i=0;i<number/2;i++) {
			if(number%i==0) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 0) {
			System.out.println(" It is Prime Number");
		}else {
			System.out.println("It is Non Prime Number");
		}

	}
}
