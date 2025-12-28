package Methods;

public class UsingVoidWithParameters {

	public static void main(String[] args) {
		add(80 , 100);
		System.out.println("a is printed");
	}

public static void add(int a , int b) {
	int c = a + b;
	System.out.println(c);
}
}