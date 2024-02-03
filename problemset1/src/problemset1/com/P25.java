package problemset1.com;

public class P25 {
	public static int sumof_divisiors(int num) {
		                int sum = 1; //  1 is always a divisor
               for (int i = 2; i <= num / 2; i++) {
		            if (num % i == 0) {
		              sum += i;
		            }
		        }
		        System.out.println("Sum of divisors of " + num + ": " + sum);
				return sum;
				
		    }
	public   static void areFriendly(int num1, int num2) {
	 
               if ((sumof_divisiors(num1)*num2) == (sumof_divisiors(num2)*num1)) {
	            System.out.println(num1 + " and " + num2 + " form a friendly pair.");
	        } else {
	            System.out.println(num1 + " and " + num2 + " do not form a friendly pair.");
	        }}
	    

	public static void main(String[] args) {
		  P25 obj = new P25();
		  P25.areFriendly(6, 28);
		}

}
