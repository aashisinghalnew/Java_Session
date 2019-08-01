package practice;

public class StringConcatenation {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		String x="Hello";
		String y="World";
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);			//30HelloWorld
		System.out.println(x+y+a+b);			//HelloWorld1020
		
		System.out.println(x+y+(a+b));			//HelloWorld30
		
		System.out.println(a+b+x+a+b+y+(a+b)); //30Hello1020World30
	}
}
