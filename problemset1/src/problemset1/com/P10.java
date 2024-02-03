package problemset1.com;

public class P10 {
	public void m1(int number) {
		 int sum = 0;
	        while (number > 0) {
	            sum = sum+number % 10;
	            number =number/ 10;
	        }
	        System.out.println("The sum of the digits of the number is " + sum + ".");
	    }
	public static void main(String[] args) {
	P10 obj = new P10();
	obj.m1(45);

	}

}
