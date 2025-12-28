package Methods;

public class UsingWithoutVoidAndParameters {

	public static void main(String[] args) {
		int res = add();
		int mul = res * 10;
		System.out.println(mul);
	}
	
	public static int add() {
		int a = 200;
		int b = 600;
		int c = a + b;
		return c;
	}

}
