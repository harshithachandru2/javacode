package problemset1.com;

public class P17 {
	public void m1(int num) {
	int i=1;int fact=1;
	while(i<=num) {
		fact=fact*i;
		i++;
	}
	System.out.println(fact);
	}

	public static void main(String[] args) {
		P17 obj = new P17();
		obj.m1(6);
		}
	}


