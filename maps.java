package basics;
import java.util.*;
public class maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> need=new HashMap<Integer,String>();      
	      need.put(1,"rama");    
	      need.put(2,"Ravana");    
	      need.put(3,"Indragith");   
	       
	      System.out.println("\nThe elements of Hash map are: ");  
	      for(Map.Entry m:need.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	      TreeMap<Integer,String> work=new TreeMap<Integer,String>();    
	      work.put(4,"sita");    
	      work.put(5,"Arjuna");    
	      work.put(6,"Bharath");       
	      
	      System.out.println("\nThe elements of Tree Map are : ");  
	      for(Map.Entry l:work.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	}

	}

}
