package fundamentals.com;
class Student {
	int studentId;
	String studentName;
	
	Student(int id,String name){
		studentId = id;
		studentName = name;
		
		
	}
	public void display() {
		System.out.println("Id :"+this.studentId+" Name:"+this.studentName);
	}
	
	
}

public class Constructor_1 {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"a");
		Student s2 = new Student(201,"b");
		s1.display();
		s2.display();
		
		

	}

}
