package problemset1.com;

public class P21 {
	public  static void sumOfProperDivisors(int num) {
	        int sum = 0;
             for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                sum =sum+ i;
	            }
	        }
                      if (sum == num) {
	            System.out.println(num + " is a perfect number.");
	        } else {
	            System.out.println(num + " is not a perfect number.");
	        }
	    }

	public static void main(String[] args) {
		 int num = 28; 
	        sumOfProperDivisors(num);
	

	}

}
