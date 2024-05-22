package employeeData.newpackage;

public class state {
	String state;
	public state(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "state [state=" + state + "]";
	}

	public static void main(String a[]) {
		state s = new state("");
	}
}
