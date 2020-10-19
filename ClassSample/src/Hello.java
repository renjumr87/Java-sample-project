
public class Hello {
	public static void main(String ar[]) {
		Sample s1 = new Sample();
		
		Sample s2 = new Sample();
		
		s1.a = 20;
		s2.a = 50;
		s1.b = 100;
		s2.b = 200;
		
		System.out.println("S1 - A = " + s1.a + " S2 - A = " + s2.a + " S1 - B = " + s1.b + " s2 - B = " + s2.b );
	}
}
