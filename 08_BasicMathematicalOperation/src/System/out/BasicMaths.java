package System.out;

import java.util.Scanner;

public class BasicMaths {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Two Numbers");
		
		int number1 = sc.nextInt();
		
		int number2 = sc.nextInt();
		
		System.out.println("Please Choose\n1 > +\n2 > -\n3 > *\n4 > /");
		
		int choice =sc.nextInt();
		
		int result;
		
		if(choice == 1) {
			result = number1 + number2;
			System.out.println("Result is : " + result);
		}else if (choice == 2) {
			result = number1 - number2;
			System.out.println("Result is : " + result);
		}else if(choice == 3) {
			result = number1 * number2;
			System.out.println("Result is : " + result);
		}else if(choice == 4) {
			result = number1 / number2;
			System.out.println("Result is : " + result);
		}
	}

}
