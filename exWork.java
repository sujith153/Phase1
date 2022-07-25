package multicodes;
class Excep extends Exception
{
	public Excep(String s)
	{
		super(s);
	}
}
public class exWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try
	        {
	        	throw new Excep("yooov");
	        }
	        catch(Excep e)
	        {
	        	System.out.println("I Caught");
	        	System.out.println(e.getMessage());
	        }

	}

}
