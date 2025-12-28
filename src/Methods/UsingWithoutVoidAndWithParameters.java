package Methods;

public class UsingWithoutVoidAndWithParameters {

	public static void main(String[] args) {
		int res = add(80, 90, 100);
		int mul = res * 10;
		System.out.println(mul);
	}
	
	public static int add(int a , int b , int c) {
		int d = a + b + c;
		return d;
	}
}
