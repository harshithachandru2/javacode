package fundamentals.com;
// definition - used to create instance of class object.-- 
//instance of class means values may vary from one object to other
//3 types                 default,parameterized,no-argument(default) constructor,private,public
//rules 1. name of constructor is same as class name
// it does not have any return type i.e void and string
//it is possible to have a multiple constructors within class
//it automatically called at time of object creation
// default constructor -  does not  have any parameters
//explicit means some things done by programmer
//implicit means its done by complier.
//                                                      syntax - class A{  
//                                                              A(){
//                                                                     }
// }
 
class Employee{
	 public Employee(){
		 System.out.println("obj created");
		 
	 }
}
public class Constructor {
	
		public static void main(String[] args) {
			 Employee obj = new  Employee();
			 System.out.println(obj);
			
			
			
		
		

	}

}
