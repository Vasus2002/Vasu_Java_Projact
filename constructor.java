package employeeData;

public class Employee {
	private String name,email;
	
	public Employee() {
		this.email = "default@gmail.com";
		this.name = "default";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Employee Details: \n" +
				"Name: "+name +"\n"+
				"email: "+email;
	}
	
	public static void main(String args[]) {
		Employee emp1 = new Employee();
		
//		emp1.setName("parth patel");
//		emp1.setEmail("parth.patel@gmail.com");
		
		System.out.println(emp1.toString());
	}
}