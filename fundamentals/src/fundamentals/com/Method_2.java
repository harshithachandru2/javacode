package fundamentals.com;

public class Method_2 {
	int data1 = 100;
	static int data2 = 200;
	
	public static void m1() {
		System.out.println(data2);// static data
		
	}
public void m2() {
	System.out.println(data1);
	System.out.println(data2);
	
}
	public static void main(String[] args) {
		Method_2.m1();
		Method_2 obj = new Method_2();
		obj.m2();
		
		
		

	}

}
