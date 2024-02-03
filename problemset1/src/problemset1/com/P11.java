package problemset1.com;

public class P11 {

	public static void main(String[] args) {
		int num=123;
		int reverse=0;int a;
		while(num!=0) {
			 a = num%10;
			reverse = reverse*10+a;
			num=num/10;
		}
		System.out.println(reverse);
		// TODO Auto-generated method stub

	}

}
