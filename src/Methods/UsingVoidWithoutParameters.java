package Methods;

public class UsingVoidWithoutParameters {

	public static void main(String[] args) {
		add();
		System.out.println("a is printed");
	}
	
	public static void add() {
		int a = 90;
		int b = 100;
		int c = a + b;
		System.out.println(c);
	}

}
