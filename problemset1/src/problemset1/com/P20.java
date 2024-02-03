package problemset1.com;

public class P20 {
	  public static int factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }
 public static void checkStrongNumber(int num) {
	        int temp = num;
	        int sum = 0; // sum of factorial of digits
               while (temp > 0) {
	            int digit = temp % 10;
	            sum =sum+ factorial(digit);
	            temp = temp/10;
	        }
                 if (sum == num) {
	            System.out.println(num + " is a strong number.");
	        } else {
	            System.out.println(num + " is not a strong number.");
	        }
	    }

	public static void main(String[] args) {
		  int num = 145;
	        checkStrongNumber(num);
		

	}

}
