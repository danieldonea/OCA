
public class Exceptions {

	public static void main(String[] args) {
		//m1();
		try{
			Test t = new Test();
			t.m();
		}catch(E1 | E2 e){ // la compile time stabileste ce se intampla
			//e.doStuff();
			e.printStackTrace();
		} catch(RuntimeException e){
			
		}
		/*catch(E2 | E e){
			e.doStuff();
		}*/
		/*catch(E1 e){
			
		}catch(E2 e){
			
		}*/
	}
	
	//throws and inheritence
	public static void m1() throws Throwable{
		
	}
}
class Test{
	void m() throws E1,E2{
		throw new E1();
	}
}

class E extends Exception{
	void doStuff(){}
}
class E1 extends Exception{	
	void m1(){
	}
}

class E2 extends Exception{	
	void m1(){
	}
}
class E3 extends Throwable{	
	void m1(){
	}
}