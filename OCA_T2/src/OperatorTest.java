
public class OperatorTest {

	public static void main(String[] args) {
		System.out.println(5.2%2.05); // curious
		System.out.println(-3%2);
		System.out.println(3%-2);
		float f = Long.MAX_VALUE + 2.0f;
		
		System.out.println(f);
		byte b = 2;
		byte b2 = 3;
		byte b3 = (byte) (b + b2);
		
		boolean x = true;
		//x != x;
		b = (byte) ~b;
		
		int i = Integer.MAX_VALUE;
		i++;
		System.out.println(i); //overflow
		
		double d = Double.MAX_VALUE;
		d++;
		System.out.println(d);
		d++;
		System.out.println(d);
		System.out.println(d == ++d);
		
		Double objDouble = Double.MAX_VALUE;
		objDouble++;
		System.out.println(objDouble);
		while (d>1){}
	}
}
