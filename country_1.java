package employeeData.newpackage;

public class country {
	String state;
	public country(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "country [state=" + state + "]";
	}

	public static void main(String a[]) {
		country s = new country("");
	}
}
