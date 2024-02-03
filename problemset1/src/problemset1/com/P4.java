package problemset1.com;

public class P4 {
	
	public void m1(int num1,int num2) {
		if(num1==num2) {
			System.out.println( "both are equal");
		}else if(num1>num2) {
			System.out.println(num1 + " is greatest");
		}else {
			System.out.println(num2 + " is greatest");
		}
		}

	public static void main(String[] args) {
		P4 obj = new P4();
		obj.m1(4, 8);
		// TODO Auto-generated method stub

	}

}
