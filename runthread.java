package multicodes;

public class runthread implements Runnable{
	public static int num = 0;
    public runthread(){
         
    }
    public void run() {
        while(runthread.num <= 10){
            try{
                System.out.println("Thread: "+(++runthread.num));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Main Thread...");
		runthread mrt = new runthread();
        Thread req = new Thread(mrt);
        req.start();
        while(runthread.num <= 10){
            try{
                System.out.println("Main Thread: "+(++runthread.num));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");

	}

}
