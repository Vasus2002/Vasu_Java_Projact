package employeeData;

public class Student {
		String name;
		public Student() {
			this.name =  "Unkonow";
		}
		public Student(String name) {
			this.name =  name;
		}
		public String getName() {
			return name;
		}
		public static void main(String a[]) {
			Student s = new Student();
			Student s1 = new Student("Parth");
			Student s2 = new Student("Vasu");
			Student s3 = new Student("Raj");
			
			System.out.println("Name is:"+s1.getName());
			System.out.println("Name is:"+s2.getName());
			System.out.println("Name is:"+s3.getName());
		}
}
