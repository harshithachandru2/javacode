package problemset1.com;

public class P1 {
	public void m1(int num) {
		if(num>0) {
			System.out.println("positive number");
		}else if(num<0) {
			System.out.println("negative number");
		}else {
			System.out.println("number is zero");
		}
		
	}

	public static void main(String[] args) {
		P1 obj = new P1();
		obj.m1(-1);
		// TODO Auto-generated method stub

	}

}
