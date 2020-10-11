import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String a[]) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("1 > Porotta\n2 > Biriyani\n3 > Fried Rice\n4 > Manthi");
		
		System.out.println("Please Choose an Option between 1-4");
		
		int choice = sc.nextInt();
		
		
		switch(choice) {
		case 1:
			System.out.println("You Have Selected Porotta");
			break;
		case 2:
			System.out.println("You Have Selected Biriyani");
			break;
		case 3:
			System.out.println("You Have Selected Fried Rice");
			break;
		case 4:
			System.out.println("You Have Selected Manthi");
			break;
		}
		
	}

}
