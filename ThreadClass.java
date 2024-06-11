package threadclass;

public class ThreadClass {
		private int n;
		private String message;
		
		public ThreadClass(int n,String message) {
			this.n=n;
			this.message=message;
		}
		public void show() {
			for(int i=0;i<=n;i++) {
				System.out.println(message+i+" "+"Current Thread"+Thread.currentThread().getName());
			}
		}
}
