package interfacedemo2;

public interface gometryinterface {
		void perofrm();
}

class MyClass{
	public void perform() {
		System.out.println("fucntional Interface method");
	}
	
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		c1.perform();
	}
}
