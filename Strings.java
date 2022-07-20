package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Methods of Strings");
			
			String str=new String("My name is Duryodhana");
			System.out.println(str.length());
			
			String str1=new String("Welcome");
			System.out.println(str1.substring(2));
			System.out.println("\n");
			System.out.println("Creating String Buffer");
			StringBuffer st=new StringBuffer("Welcome to the new world!  ");
			st.append("Enjoy every minute");
			System.out.println(st);
			System.out.println("\n");
			System.out.println("Creating a String  Builder");
			StringBuilder sb1=new StringBuilder("Work ");
			sb1.append("Happily");
			System.out.println(sb1);

			System.out.println(sb1.delete(0, 1));

			System.out.println(sb1.insert(1, "Welcome "));

			System.out.println(sb1.reverse());

	}

}
