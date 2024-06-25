package democonnection;

public class demogeneric {
	public static void main(String a[]) {
		geniricdemo<String,String> name = new geniricdemo<String,String>();
		name.setData("Vasu");
		name.setData1("Sojitra");
		System.out.println(name);
		
		geniricdemo<String,Integer> name1 = new geniricdemo<String,Integer>();
		name1.setData("Vasu");
		name1.setData1(12);
		System.out.println(name1);
	}	
}
