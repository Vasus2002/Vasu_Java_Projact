package tsnf.geometry;

public class Rectangle {
		double l,w;

		public Rectangle(double l, double w) {
			this.l = l;
			this.w = w;
		}
		
		double calculateArea() {
			return l*w;
		}
		public double calculatePerimeter() {
			return 2*(l+w);
		}
}
