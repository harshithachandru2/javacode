package problemset1.com;

public class P6 {

	public void m1(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println(a + " is greatest");
			}else if(b>a && b>c) {
				System.out.println(b + " is greatest");
		}else {
			System.out.println(c + " is greatest");
		}
		
	}

	public static void main(String[] args) {
		P6 obj = new P6();
		obj.m1(2, 02,03);
		// TODO Auto-generated method stub

	}

}
