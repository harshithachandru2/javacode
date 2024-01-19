package fundamentals.com;
class car{
	int wheels;
	String name;
	
	car(int wheels,String Name){
		this.wheels = wheels;
		this.name = Name;
		
	}
	public void show() {
		System.out.println("wheels:"+this.wheels+" Name:"+this.name);
	}
}

public class This_keyword_2 {

	public static void main(String[] args) {
		
		car c =new car(4,"santro");
		c.show();
		

	}

}
