package multicodes;

public class thread extends Thread {
	 public void run() {
	    	System.out.println("Executing multithreading using Thread class");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread s=new thread();
        s.start();

	}

}
