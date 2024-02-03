package problemset1.com;

public class P9 {

	public static void main(String[] args) {
		int lower = 1, upper = 20;
    for (int i = lower; i <= upper; i++) {
	       if (isPrime (i)) 
	        System.out.println (i);}
	   }

	   static boolean isPrime (int n)
	   {
	                                  // 0, 1 negative numbers are not prime
	     if (n < 2)
	       return false;

	    for (int i = 2; i < n; i++)
	       {
	     if (n % i == 0)
	        return false;
	       }
 return true;

	}

}
