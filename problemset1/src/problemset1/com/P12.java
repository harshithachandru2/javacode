package problemset1.com;

public class P12 {

	public static void main(String[] args) {
		int num=121;
		int reverse=0;int a; int temp=num;
		while(num!=0) {
			 a = num%10;
			reverse = reverse*10+a;
			num=num/10;
		}
		if(temp==reverse)
			System.out.println("given number is polindrome");
		else
			System.out.println("given number is not polindrome");
		
		// TODO Auto-generated method stub

	}

}
