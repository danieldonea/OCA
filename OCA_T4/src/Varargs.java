package p1;

public class Varargs {

	public void testMethod(short num1) {
		System.out.println("Java 4");
	}

	public void testMethod(short... num1) {
		System.out.println("Java 5");
	}

	public static void main(String... str) {
		//new Varargs().testMethod(3);
		new Varargs().testMethod2(1,2);
	}
	
	public void testMethod2(int... i){
		System.out.println("Varargs");
	}
	
	public void testMethod2(int i, int j){
		System.out.println("Params");
	}
}
