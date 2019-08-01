package practice;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		int i=1;
		int j=++i;	//pre increment
		
		System.out.println(i);  //2
		System.out.println(j);  //2
		
		int m=1;
		int n=m++;	//post increment
		System.out.println(m);  //2
		System.out.println(n);  //1
		
		int d=2;
		int c=--d;	//pre decrement
		System.out.println(d); //1
		System.out.println(c); //1
		
		int g=2;
		int h=g--;	//post decrement
		System.out.println(g); //1
		System.out.println(h); //2
	}

}
