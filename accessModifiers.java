package basics;

public class accessModifiers {
	public void methodPublic()
	{
		System.out.println("Public");
	}
	private void methodPrivate() {
		System.out.println("Private");
	}
	void methodDefault() {
		System.out.println("Default");
	}
	protected void methodProtected() {
		System.out.println("Protected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 accessModifiers req=new accessModifiers();
	        req.methodPublic();
	        req.methodPrivate();
	        req.methodDefault();
	        req.methodProtected();

	}

}
