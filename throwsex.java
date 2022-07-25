package multicodes;

public class throwsex {
	void Div() throws ArithmeticException
    {
    	int num1=80,num2=0,ans;
    	ans=num1/num2;
    	System.out.println("Answer is: "+ans);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwsex req=new throwsex();
        try
        {
        	req.Div();
        }
        catch(ArithmeticException e)
        {
        	System.out.println("Error: "+e.getMessage());
        }

	}

}
