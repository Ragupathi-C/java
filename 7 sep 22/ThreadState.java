
class one extends Thread {
	public void run() {
		System.out.println("Started first thread....");
		for (int i = 1; i <= 5; i++) {
			if (i == 1) {
			}

			System.out.println("From thread one:i =" + i);
		}
		System.out.println("..end of thread one");
	}
}

class two extends Thread {
	public void run() {
		System.out.println("thread two started");
		for (int j = 1; j <= 5; j++) {
			System.out.println("from thread two:j=" + j);
			if (j == 2) {
			}

			System.out.println("thread two stopped");
		}
	}
}

class three extends Thread {
	public void run() {
		System.out.println("thread three started");
		for (int k = 1; k <= 5; k++) {
			System.out.println("from thread three:j=" + k);
			if (k == 3) {
				try {
					sleep(5000);
				} catch (Exception e) {
				}
			}
		}
		System.out.println("Exit thread three");
	}
}

public class ThreadState {
	public static void main(String[] args) {
		one o = new one();
		two t = new two();
		three th = new three();
		o.start();
		o.yield();
		t.start();
		th.start();
		System.out.println("End of Execution");
	}
}
