package tsnf.GeometryPackageDemo;

import tsnf.geometry.Circle;
import tsnf.geometry.Rectangle;
import tsnf.geometry.Triangle;

public class GeometryPackageDemo {
	public static void main(String[] args) {
	Circle c = new Circle(5);
    Rectangle r = new Rectangle(4.3, 6.5);
    Triangle t = new Triangle(3.4, 4.5, 5.6);

    System.out.println("Circle:");
    System.out.println("Area: " + c.calculatePerimeter());
    System.out.println("Perimeter: " + c.calculatePerimeter());

    System.out.println("\nRectangle:");
    System.out.println("Area: " + r.calculatePerimeter());
    System.out.println("Perimeter: " + r.calculatePerimeter());

    System.out.println("\nTriangle:");
    System.out.println("Area: " + t.calculateArea());
    System.out.println("Perimeter: " + t.calculatePerimeter());
}
}
