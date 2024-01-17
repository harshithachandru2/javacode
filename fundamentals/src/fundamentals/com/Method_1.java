package fundamentals.com;
//syntax
// based on accessibility
//two categories
//non static method -through object
//static method - through class
//non static fun -- access static and instance variables
//static fun -- static 

public class Method_1 {
	//method definition
	public void m1() {
		System.out.println("m1() executed");
	}
	
	
	public int squareofNumber(int num) {
		return num*num;
	}
	
	public static void m2() {
		System.out.println(" static m2 executed");
	}
	
	public static String greet(String name) {
		return "good morning " + name;
		
	}

	public static void main(String[] args) {
		Method_1 obj = new Method_1();
		obj.m1();//calling function or invoking fun
int result = obj.squareofNumber(3);
System.out.println(result);
Method_1.m2();
String result2 = Method_1.greet("akash");
System.out.println(result2);
	}

}
