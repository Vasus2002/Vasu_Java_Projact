package tsnf.newpackage.personalinfo;

import employeeData.newpackage.country;
import employeeData.newpackage.state;

public class Person {
	String name;
	state s1;
	country c1;
	public Person(String name, country c1, state s1) {
		super();
		this.name = name;
		this.s1 = s1;
		this.c1 = c1;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", s1=" + s1 + ", c1=" + c1 + "]";
	}
	
}
