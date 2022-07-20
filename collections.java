package basics;
import java.util.*;
public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrayList");
		ArrayList<String> work=new ArrayList<String>();   
	      work.add("training");//
	      work.add("intern");    	   
	      System.out.println(work);  
		
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> num = new Vector();
	      num.addElement(60); 
	      num.addElement(30); 
	      System.out.println(num);
	      
	      System.out.println("\n");
	      System.out.println("Linked List");
	      LinkedList<String> var=new LinkedList<String>();  
	      var.add("cena");  
	      var.add("kmr");  	      
	      Iterator<String> itr=var.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  

}

	}

}
