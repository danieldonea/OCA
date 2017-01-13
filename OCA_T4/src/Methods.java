package p1;

public class Methods {

	static void m(long l){
		System.out.println("long");
	}
	
	static void m(float f){
		System.out.println("float");
	}
	
	static void m (Integer i){
		System.out.println("Integer");
	}
	
	static void m (Float i){
		System.out.println("Float");
	}
	
	static void m (Number i){
		System.out.println("Number");
	}
	
	public static void main(String[] args) {
		m(2L);
		m2(1, 1);
		//m2(1, (int)1);
		m2((Integer)1, 1);
		m2(new Integer(1), 1);
		m2(new Integer(1), (int)1);
		m2(1, new Integer(1));
	}
	
	
	public static void m2(Integer i, int i2){
		System.out.println("First");
	}
	
	public static void m2(int i, Integer i2){
		System.out.println("Second");
	}
	
	public static void m2(Integer i, Integer i2){
		System.out.println("Third");
	}
	
	public static void m2(int... i){
		System.out.println("Forth");
	}
}
