package problemset1.com;

public class P5 {
	int num1=5;
	int num2=10;
	int i; int sum;
	public void m1() {
		for(i=num1;i<=num2;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		P5 obj = new P5();
		obj.m1();
		// TODO Auto-generated method stub

	}

}
