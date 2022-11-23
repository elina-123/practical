package pro1;

public class JionMethod extends Thread {
public void run() {
	for(int i=1;i<=3;i++) {
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			System.out.println(e);
		}System.out.println(i);
		}}
	public static void main(String[] args) {
		JionMethod t = new JionMethod();
		JionMethod t1 = new JionMethod();
		JionMethod t2 = new JionMethod();
		t.start();
		try {
			t.join();
		}
		catch (Exception e) {
			System.out.println(e);
		}t1.start();
		t2.start();
	}

}
