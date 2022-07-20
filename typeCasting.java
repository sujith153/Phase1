package basics;
public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implicit Type Casting");
		byte a=32;
		int b=a;
		float c=a;
		long d=a;
		double e=a;
		System.out.println("Byte Value of a: "+a);
		System.out.println("Int Value of a: "+b);
		System.out.println("Float Value of a: "+c);
		System.out.println("Long Value of a: "+d);
		System.out.println("Double Value of a: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		
		double f=89.8;
		int g=(int)f;
		byte h=(byte)f;
		char i=(char)f;
		System.out.println("Float Value of f: "+f);
		System.out.println("Int Value of f: "+g);
		System.out.println("Byte value of f:"+h);
		System.out.println("char value of f:"+i);

	}

}
