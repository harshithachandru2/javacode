package fundamentals.com;
//,relation,logical,unary,ternary,bitwise,shift,instance of

public class Operator {
public void arithmeticOperator() {
	int a =10;
	int b = 5;
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a/b);
	System.out.println(a*b);
	System.out.println(a%b);//remainder
	
	
	
}
public void unaryOperator() {
	int a = 10;
	int b = a++;
	System.out.println(a+""+b);
	
	int c = 20;
	int d = ++c;
	System.out.println(c+""+d);
	
	int x = 100;
	System.out.println(-x);
	
	boolean y = true;
	System.out.println(!y);//inverse //not operator
	
}

public void relationalOperator() {
	int a = 10;
	int b = 5;
	int c = 10;
	System.out.println(a==b);
	System.out.println(a==c);
	System.out.println(a!=b);
	System.out.println(a>b);
	System.out.println(a>=b);
	System.out.println(a<c);
	System.out.println(a<=c);
}

public void logicalOperator() {
	int x = 100;
	int y = 200;
	System.out.println((x!=y)&&(x>y));
	System.out.println((x!=y)||(x>y));
	
	
}

public void shiftOperator() {
	int x=2;
	System.out.println(x<<1);
	
	int y = 10;
	System.out.println(y>>1);
}
 public void bitwiseOperator() {
	 int x=10;
	 int y=9;
	 System.out.println(x&y);
	 System.out.println(x|y);
	 System.out.println(x^y);
	 System.out.println(~x);//-(x+1)
	 System.out.println(~y);
	 
 }
 public void instanceofOperator() {
	 String str ="Hello";
	 System.out.println(str instanceof String);
 }
public void ternaryOperator() {
	int x = 10;
	int y = 20;
	boolean result = x<y?true:false;
	System.out.println(result);
	
	System.out.println(!(x==y)?1:0);
}
	public static void main(String[] args) {
		Operator  operators= new Operator();
				
		operators.unaryOperator();
		operators.ternaryOperator();
		operators.instanceofOperator();
		operators. bitwiseOperator();
		operators.shiftOperator();
		operators.arithmeticOperator();
		operators.relationalOperator();
		operators.logicalOperator();
		
		
		
		
		
				
		

	}

}
