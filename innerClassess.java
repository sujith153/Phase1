package basics;

public class innerClassess {
	private String msg="working on Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", work to do");}  
	 }  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerClassess work=new innerClassess();
		innerClassess.Inner need=work.new Inner();  
		need.hello();  

	}

}
