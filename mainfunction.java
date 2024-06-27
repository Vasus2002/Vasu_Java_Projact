package lembdaexp;

//class test implements demointerface{
//	public void letUsGreet() {
//		System.out.print("hey");
//	}
//}



interface totalprise{
	void getTotal();
}
interface calculate {
	int getsquare(int no);
}

interface deposite{
	void getdetail(String name,int amt);
}
public class mainfunction {
	public static void main(String a[]) {
		
		// lambda function 
		demointerface d1 = () ->System.out.println("Good morning");
		d1.letUsGreet();
		
		totalprise d2 = () -> System.out.println(23+45);
		d2.getTotal();
		
		calculate d3 = (int no) -> no * no;
		System.out.println(d3.getsquare(23));
		
		deposite d4 = (String name,int amt) -> {
			System.out.println("name :"+name);
			amt += 2000;
			System.out.println("balance :"+ amt);

		};
		d4.getdetail("vasu", 12000);
		
	}
}
