package pro1;

public class DaemonThreadEg extends Thread {
	public void run() {
		System.out.println("name: "+Thread.currentThread().getName());
		System.out.println("Daemon: "+Thread.currentThread().isDaemon());		
		if(Thread.currentThread().isDaemon()) {//checking for daemon thread
	System.out.println("i an daemon thread");		
		}else {
			System.out.println("i am user thread");}
		}
	public static void main(String[] args) {
		DaemonThreadEg t1 = new DaemonThreadEg();	
		DaemonThreadEg t2 = new DaemonThreadEg();	
		t1.start();
		t1.setDaemon(true);//we will throw exception
		t2.start();
	}

}
