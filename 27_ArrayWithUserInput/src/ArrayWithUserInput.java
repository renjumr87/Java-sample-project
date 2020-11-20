import java.util.Scanner;

public class ArrayWithUserInput {
	public static void main (String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a limit\n");
		
		int limit = sc.nextInt();
		
		
		System.out.println("Please enter values\n");
		
		int[] arr = new int[100];
		
		for(int i=0;i<limit;i++) {
			 arr[i] = sc.nextInt();
	
		}
		
		System.out.println("Entered values are\n");
		
		for(int i=0;i<limit;i++){
			System.out.print(arr[i] + " ");
		}
	}
}

