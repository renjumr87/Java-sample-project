import java.util.Scanner;

public class Grade {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Your Mark Percentage");
		
		int mark = sc.nextInt();
		
		if(mark>90) {
			System.out.println("Your Grade is A");
		}else if(mark>80) {
			System.out.println("Your Grade is B");
		}else if(mark>70){
			System.out.println("Your Grade is C");
		}else if(mark>60) {
			System.out.println("Your Grade is D");
		}else if(mark>50) {
			System.out.println("Your Grade is E");
		}else {
			System.out.println("You are Failed");
		}
		
	}

}
