
public class $Test {
	public static void main(String[] args) {
		int i;
		try{
			i = 1;
		} catch(Exception e){
			i = 2;
		} 
		//finally {
//			i = 2;
	//	}
		i++;
		
		testObject();
	}

	private static void testObject() {
		Object o;
		if (o == null){
			o = new Object();
		} 
		if (true){  // daca se sterge linia
			o = new Object();
		}
		o.getClass();
	}
	
	private static void testObject2(Object x) { // este x local?
		x.getClass();
	}
}
