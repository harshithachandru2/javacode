package problemset1.com;

import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;int n;int a=0;int b=1;int nextterm=0;
		System.out.println("enter the n value");
		n=sc.nextInt();
		if(n==0||n==1)
			System.out.println(n);
		else
			nextterm=a+b;
		for(i=3;i<=n;++i) {
			a=b;
			b=nextterm;
			nextterm=a+b;
		}
		System.out.println(b);
	}

}
