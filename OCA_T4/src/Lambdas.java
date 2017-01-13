package p1;


public class Lambdas {
	
	static String thirdName = "Test3";
	
	String fourthName = "Test4";

	public static void main(String[] args) {
		
		String name = "Test";
		Runnable r1 = () -> System.out.println(name);
		r1.run();
	/*	
		String secondName = "Test2";
		secondName = secondName.toUpperCase();
		Runnable r2 = () -> System.out.println(secondName);
		r2.run();*/
		
		changeName();
		Runnable r3 = () -> System.out.println(thirdName);
		r3.run();
	}
	
	static void changeName(){
		thirdName = "Test4";
	}
	interface I1{
		void m1(int number);
	}

	static void why(){
		int num = 1;
		
		I1 i = (x) -> { x = 3; int a = num; num = 4;} ;
		
		I1 anonymousClass = new I1(){
			public void m1(int number) {
				number = 3;
				int a = num;
				num = 4;
			}
		};
	}
}
