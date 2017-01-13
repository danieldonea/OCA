package p1;

public class Constructors {

	int i = 0;
	String s = "a";
	
	public Constructors(){
		this(1);
		this.i = 1;
	}
	
	public Constructors(int i){
		this("");
		this.s = "b";
	}
	
	public Constructors(String s){
		this();
	}
	
	public static void main(String[] args) {
		Constructors c = new Constructors();
		System.out.println(c.i);
		System.out.println(c.s);
	}
}
