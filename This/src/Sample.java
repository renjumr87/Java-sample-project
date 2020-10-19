
public class Sample {
	int a = 5,b = 100;
	
	Sample(int a, int b){
		System.out.println("a : " + a + "b : " + b);
		
		this.a = a;
		this.b = b;
		System.out.println("Global a : " + this.a + " Global b : " + this.b);
	}
}
