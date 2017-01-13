package p1;

class A {
	
	int i = 1;
	
	public int getI() {
		return this.i;
	}
}

class B extends A {
	
	public int i = 2;
	
}

public class Inheritence{
	
	public static void main(String[] args) {
		B b = new B();
		A a = b;
		
		System.out.println(a.getI());
		System.out.println(a.i);
		System.out.println(b.i);
		
		A a2 = new A();
		B b2 = (B) a2;
		
		System.out.println(a2.getI());
		System.out.println(a2.i);
		
		System.out.println(b2.getI());
		System.out.println(b2.i);
	}
}