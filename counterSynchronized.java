package syncrothread;

class counterno{
	int cnt;
	public void get_income() {
		cnt++;
	}
}
public class counter {
		public static void main(String a[]) {
			counterno ct = new counterno();
			
			Thread t1 = new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i=0;i<1000;i++) {
						ct.get_income();
//						try {
//						Thread.sleep(1000);
//						}
//						catch(InterruptedException e) {
//							e.printStackTrace();
//						}
					}
				}
			});
			Thread t2 = new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i=0;i<1000;i++) {
						ct.get_income();
//						try {
//						Thread.sleep(1000);
//						}
//						catch(InterruptedException e) {
//							e.printStackTrace();
//						}
					}
				}
			});
			t1.start();
			t2.start();
			try {
				t1.join();				}
				catch(InterruptedException e) {
					
				}
//			ct.get_income();
			System.out.println(ct.cnt);
		}
}
