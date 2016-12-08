package ClassNamingTests;

public class SameClassNames {

	public static class SameClassNames2 {
		SameClassNames2(){
			System.out.println("Internal 2");
		}
	}
	
	public static class SameClassNames3 {
		SameClassNames3(){
			System.out.println("Internal 3");
		}
	}
	
	SameClassNames(){
		SameClassNames2 s2 = new SameClassNames2();
	}

}
