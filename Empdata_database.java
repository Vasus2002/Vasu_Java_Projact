package democonnection;

public class Empdata_database {
	private int s_id,age;
	private String name;
	
	public Empdata_database(int s_id,String name,int age){
		this.s_id=s_id;
		this.name=name;
		this.age=age;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
