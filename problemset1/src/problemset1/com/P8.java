package problemset1.com;

public class P8 {
		public static void m1(int num) {
			 boolean isPrime = true;
              for (int i = 2; i <= num / 2; i++) {
			            if (num % i == 0) {
			                isPrime = false;
			                break;
			            }
			        }

			        if (isPrime) {
			            System.out.println(num + " is a prime number.");
			        } else {
			            System.out.println(num + " is not a prime number.");
			        }
			    }
	    
	public static void main(String[] args) {
		  int num = 7; 
              m1(num);
              }
	}
