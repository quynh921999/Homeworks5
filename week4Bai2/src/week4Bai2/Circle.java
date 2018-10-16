package week4Bai2;

public class Circle extends Shape{
	private double radius = 1.0;
	final double PI = 3.14;
	
	public Circle() {}
	public Circle(double radius) {
		this.setRadius(radius);
	}
	public Circle(double radius, String color, boolean filled) {
		this.setRadius(radius);
		this.setColor(color);
		this.setFilled(filled);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return PI * radius * radius;
	}
	public double getPrimeter() {
		return PI * radius *2;
	}
	public String toString () {
		return "radius = " + this.getRadius() +"\n" +"Area = " + this.getArea()
							+"\n" + "Primeter = " + this.getPrimeter();
	}
	
}
