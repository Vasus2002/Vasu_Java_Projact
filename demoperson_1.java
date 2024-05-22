package tsnf.newpackage.personalinfo;

import employeeData.newpackage.country;
import employeeData.newpackage.state;

public class demoperson {
	public static void main(String a[]) {
	country c = new country("India");
	state s = new state("Gujrate");
	Person p = new Person("vasu",c,s);
	System.out.println(p);
	}
}
