import java.util.Scanner;

public class DisplayDay {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a Number between 1 -7");
		
		int day = sc.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednessday");
			break;
		case 5:
			System.out.println("Thusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		}
		
	}
}
