package threadclass;

public class ThreadClassExecutor {
	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass(5,"first");
		ThreadClass t2 = new ThreadClass(8,"second");
		
		t1.show();
		t2.show();
	}
}
