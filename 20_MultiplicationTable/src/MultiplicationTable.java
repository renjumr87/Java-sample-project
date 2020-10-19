import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a Number to Print Multiplication Table");
		
		int number = sc.nextInt();
		int result;
		for(int i=1;i<=10;i++) {
			result = i*number;
			System.out.println(i + " * " + number +" = " + result);
		}
	}

}
