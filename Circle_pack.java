package tsnf.geometry;

public class Circle {
		double r;
		public Circle(double r) {
			this.r = r;
			
		}
		double CalArea() {
			return 3.14*r*r;
		}
		
		public double calculatePerimeter() {
			return 2*3.14*r;
		}
}
