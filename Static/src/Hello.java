import java.util.Scanner;

public class Hello {
	
	int a = 10;
	static int b = 20;
	public static void main(String[] args) {
		Hello h = new Hello();
		
		Hello h1 = new Hello();
		
		System.out.println(h.a);
		
		h.b = 50;
		
		h1.b = 100;
		
		h.a = 1000;
		
		h1.a = 1500;
		
		System.out.println("h.b : " + h.b);
		
		System.out.println("h1.b : " + h1.b);
		
		System.out.println("h.a : " + h.a);
		
		System.out.println("h1.a : " + h1.a);
		
		h.printNumber();
		
		hey();
		
		h.hey();
	}
	
	void printNumber() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a Number");
		
		int number = sc.nextInt();
		
		System.out.println("Entered Number is: " + number);
		
	}
	
	static void hey() {
		System.out.println("Hello World !!! I'm a Static Function");
	}

}
