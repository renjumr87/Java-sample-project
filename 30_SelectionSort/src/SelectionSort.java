import java.util.Scanner;

public class SelectionSort {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Limit\n");
		
		int limit = sc.nextInt();
		
		System.out.println("Enter Values");
		
		int[] values = new int[20];
		int i,j,temp;
		
		// Get array values
		
		for(i = 0; i < limit; i++) {
			values[i] = sc.nextInt();
		}
		
		// Display Entered Values
		
		System.out.println("Entered Values are \n");
		
		for(i = 0; i < limit; i++) {
			System.out.print(values[i] + " ");
		}
		
		// Sorting Array in Ascending Order
		
		for(i = 0; i < limit; i++) {
			for(j = 0; j < limit; j++) {
				if(values[i] < values[j]) {
					temp = values[j];
					values[j] = values[i];
					values[i] = temp;
				}
			}
		}
		
		//Display The Sorted Array in Ascending Order
		
		System.out.println("Sorted Values are \n");
		
		for(i = 0; i < limit; i++) {
			System.out.print(values[i] + " ");
		}
	}

}
