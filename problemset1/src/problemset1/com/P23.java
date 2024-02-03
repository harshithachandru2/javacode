package problemset1.com;

public class P23 {
	 public static void sumOfDigits(int num) {
		 int sum = 0;
            int temp = num;
	        while (temp > 0) {
	            sum = sum+temp % 10;
	            temp =temp/ 10;
	        }
	        System.out.println("Sum of digits of " + num + ": " + sum);
	    }
             public static void Harshad(int num) {
	        int sum = 0;
	        int temp = num;
              while (temp > 0) {
	            sum = sum+temp % 10;
	            temp =temp/ 10;
	        }
                if (num % sum == 0) {
	            System.out.println(num + " is a Harshad number.");
	        } else {
	            System.out.println(num + " is not a Harshad number.");
	        }
	    }

	public static void main(String[] args) {
		P23 obj = new P23();
		int num=12;
		
		P23.sumOfDigits(num);
		P23.Harshad(num);
		

	}

}
