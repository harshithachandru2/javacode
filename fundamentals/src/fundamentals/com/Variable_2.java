package fundamentals.com;
//static keyword is required to declare variable as static
//static variable is related to class
//it can be access by class name
//syntax  _  Classname.varName;
//every object sharing the same copy of static variable
// note interview static variables can also access using object but it not recommended

public class Variable_2 {
	static int data = 100;

	public static void main(String[] args) {
		 System.out.println(Variable_2.data);
		 
		 System.out.println("Accessing static data using object");
		 Variable_2 obj1 = new Variable_2();
		 System.out.println(obj1.data);
		 
		 Variable_2 obj2 = new Variable_2();
		 System.out.println("static data for obj1:"+obj1.data);
		 System.out.println("static data for obj2:"+obj2.data);
		 
		 System.out.println("after modification");
		 obj1.data = 500;
		 System.out.println("current value  for obj1:"+obj1.data);
		 System.out.println("current value for obj2:"+obj2.data);
		 
		 
		 
		 

	}

}
