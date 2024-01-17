package fundamentals.com;

public class Variable {
	int a = 10;//instance variable

	public static void main(String[] args) {
	// creating object : ClassName objName = new ClassName();
		Variable obj1 =new Variable();
		System.out.println("current value of a obj1:"+obj1.a);
		
		
		Variable obj2 = new Variable();
		System.out.println("current value of a for obj2:"+obj2.a);
		
		System.out.println("....after modification");
		obj1.a =20;
		System.out.println("current value of a obj1:"+obj1.a);
		System.out.println("current value of a for obj2:"+obj2.a);
		
	}

}
