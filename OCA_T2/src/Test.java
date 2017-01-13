public class Test {

	public static void main(final String[] args) {
		unaryOperatorPrecedence();
		why();
		booleanXOR();
	}

	private static void booleanXOR() {
		int a = 1;
		int b = 1;

		boolean c = true;
		boolean d = false;

		System.out.print("int XOR: ");
		xor(a, b);
		System.out.print("int NEQ: ");
		neq(a, b);
		System.out.print("int XOR: ");
		xor(c, d);
		System.out.print("int NEQ: ");
		neq(c, d);
	}

	private static void xor(final int a, final int b) {
		System.out.println(a ^ b);
	}

	private static void neq(final int a, final int b) {
		System.out.println(a != b);
	}

	private static void xor(final boolean a, final boolean b) {
		System.out.println(a ^ b);
	}

	private static void neq(final boolean a, final boolean b) {
		System.out.println(a != b);
	}

	private static void why() {
		short x = 10;
		short y = 3;
		short z = x * y;
		final byte b1 = 1;
		final byte b2 = 126;
		byte sum = b1 + b2;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(sum);

	}

	private static void unaryOperatorPrecedence() {
		int i = 0;
		i += i++;
		i = i + i++ + 1
		i = 0 + 0 + 1// i = 1
		System.out.println(i);
		
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		
		int x = 3;
		int y = --x * 5 / x--;

		System.out.println("x is " + x);
		System.out.println("y is " + y);

		boolean b1, b2, b3;

		b1 = b2 = b3 = false;

		boolean result = (b1 = true) || (b2 = true) && (b3 = true);
		System.out.printf("b1:%b  b2:%b  b3:%b", b1, b2, b3);

	}

}