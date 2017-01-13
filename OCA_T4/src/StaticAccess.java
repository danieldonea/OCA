package p1;

public class StaticAccess {

	//////////////////////////
	static int a = 1;
	//int a = 2;
	int b = 3;
	
	//public static void main(String[] args) {
	//	System.out.println(a);
	//	System.out.println(b);
	//}
	
    //////////////////////////
	int c = 4;
	static int d = 5;
	
	static {
	//	d = c;
		f = 2;
	}
	
	static int f = 3;
	
	static {
		g = c;
	}

	{
	 g = c;
	}
	
	static int g = 3;
		
	public static void main(String[] args) {
		System.out.println(f);
		System.out.println(g);
	}
	
	//////////////////////////
	
	static{
		h = 1;
	}
	
	final static int h;
	
    //////////////////////////
	
	static{
		i += 3;
	}
	
	static int i = 2;
}
