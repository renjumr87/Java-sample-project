
public class B extends A{
	int a;
	
	B(){
		super(10);
		System.out.println("This is Constructor of B");
	}
	
	B(int a){
		
		System.out.println("This is Argument Constructor of B");
	}
	
	public static void main(String[] args) {
		
		B b = new B();
//		b.display();
//		b.baseDisplay();
		
	}
	
	void baseDisplay() {
		super.display();
	}
	void display() {
		System.out.println("This is Class B");
		a = 20;
		super.a = 50;
		int c = a+super.a;
		System.out.println("Result is : " + c);
	}
}
