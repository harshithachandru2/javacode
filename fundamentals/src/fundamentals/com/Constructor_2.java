package fundamentals.com; //copy constructor
class Vehicle{
	int wheels;
	String name;
	
	Vehicle(int numberofWheels,String carName){
		wheels = numberofWheels;
		name= carName;
		
	}
	Vehicle(Vehicle obj){
		wheels = obj.wheels;
		name = obj.name;
	}
	
	public void display() {
		System.out.println("wheels :"+this.wheels+" name :"+this.name);
	}
}

public class Constructor_2 {

	public static void main(String[] args) {
		Vehicle v1= new Vehicle(4,"rangerover");
				v1.display();
		Vehicle v2 = new Vehicle(v1);
		v2.display();
		
		
		

	}

}
