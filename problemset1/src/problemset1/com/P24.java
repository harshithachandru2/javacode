package problemset1.com;

public class P24 {
	 public  static void sumof_divisior(int num) {
	        int sum = 0;
             for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                 sum =sum+ i;
	            }
	        }
	        if (sum > num) {
	            System.out.println(num + " is an abundant number.");
	        } else {
	            System.out.println(num + " is not an abundant number.");
	        }
	    }

	public static void main(String[] args) {
		P24 obj = new P24();
		P24.sumof_divisior(12);
		

	}

}
