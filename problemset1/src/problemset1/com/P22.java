package problemset1.com;

public class P22 {
	public static void checkPerfectSquare(int num) {
      
                int sqrt = 0;
        while (sqrt * sqrt <= num) {
            if (sqrt * sqrt == num) {
                System.out.println(num + " is a perfect square.");
                return;
            }
            sqrt++;
        }
        System.out.println(num + " is not a perfect square.");
    }

	public static void main(String[] args) {
	    int num = 16; 
        checkPerfectSquare(num);
		

	}

}
