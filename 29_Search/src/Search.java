import java.util.Scanner;

public class Search {
public static void main(String ar[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Array Limit\n");
	
	int limit = sc.nextInt();
	
	System.out.println("Enter Values");
	
	int[] values = new int[20];
	int flag = 0,i;
	
	// Get array values
	
	for(i = 0; i < limit; i++) {
		values[i] = sc.nextInt();
	}
	
	System.out.println("Enter Search Term");
	
	int searchKey = sc.nextInt();
	
	// Doing Search
	
	for(i = 0; i < limit; i++) {
		if(searchKey == values[i]) {
			flag = 1;
			break;
		}
	}
	
	//Display the Search Result
	
	if(flag == 1) {
		System.out.println("Item found at Position " + (i + 1));
	}else {
		System.out.println("Item not found");
	}
}




}
