package pro1;

public class DaemonExample extends Thread  {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
	System.out.println(Thread.currentThread().getName());
	System.out.println("i an daemon");
		}else {
	System.out.println("i am user");		
		}
	}
	public static void main(String[] args) {
		DaemonExample t = new DaemonExample();
		DaemonExample t1 = new DaemonExample();
		DaemonExample t2 = new DaemonExample();
t1.setDaemon(true);
t.start();
t1.start();
t2.start();
	}

}


