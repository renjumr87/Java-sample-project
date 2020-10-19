import java.util.Scanner;

public class ArrayInputOutput {
	public static void main (String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter values");
		
		int arr[];
		
		for(int i=0;i<5;i++) {
			 arr[i] = sc.nextInt();
	
		}
		
		System.out.println("Entered values are");
		
		for(int i=0;i<5;i++){
			System.out.println(arr[i]);
		}
	}
}
