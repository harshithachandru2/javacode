package fundamentals.com;

//local variables
//variables define inside method
//it can be access within the method only


public class Variable_3 {
	public void m1() {
		int a =200;
		System.out.println(a);
	}

	public static void main(String[] args) {
		//System.out.println(Variable_3.a);
		Variable_3 obj = new Variable_3();
		//System.out.println(obj.a);
		obj.m1();

	}
	

}
