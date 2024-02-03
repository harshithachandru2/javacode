package problemset1.com;

public class P2 {
	 public static void checkEvenOdd(int num) {
	        if (num % 2 == 0) {
	            System.out.println(num + " is even.");
	        } else {
	            System.out.println(num + " is odd.");
	        }
	    }

	public static void main(String[] args) {
		P2 obj = new P2();
		P2.checkEvenOdd(3);
		

	}

}
