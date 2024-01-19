package fundamentals.com;
class java{
	java(){
		System.out.println("value of this :" +this);
	}
	
}

public class This_keyword {

	public static void main(String[] args) {
		java obj = new java();
		System.out.println("value of obj :" +obj);
		
		java obj2 = new java();
		System.out.println("value of obj2 :"+obj2);

	}

}
