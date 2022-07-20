package basics;
import java.util.regex.*;
public class regularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String work = "[a-z]+";
		String done = "Work Done";
		Pattern sa = Pattern.compile(work);
		Matcher abc = sa.matcher(done);
		
		while (abc.find())
	      	System.out.println( done.substring( abc.start(), abc.end() ) );

	}

}
