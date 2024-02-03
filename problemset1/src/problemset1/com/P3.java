package problemset1.com;

public class P3 {
	int i;
	int n=5; int sum=0;
	public void m1() {
		for(i=1;i<=n;i++) {
			sum=sum+i;
			
		}
		System.out.println("sum of n numbers : " + sum);
	}

	public static void main(String[] args) {
		P3 obj = new P3();
		obj.m1();
		// TODO Auto-generated method stub

	}

}
