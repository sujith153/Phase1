package multicodes;
class cal
{
	public int add(int a,int b)
	{
		int req=a+b;
		return req;
	}
	public int add(int a,int b,int c)
	{
		int req=a+b+c;
		return req;
	}
	public double add(double a,double b)
	{
		double req=a+b;
		return req;
	}
}
public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        cal c=new cal();
	        System.out.println(c.add(8,33));
	        System.out.println(c.add(48,45,445));
	        System.out.println(c.add(73.4, 22.7));

	}

}
