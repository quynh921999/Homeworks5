package week4Bai2;

public class Rectangle extends Shape {
	private double width = 1.0;
	private double length = 1.0;
	
	public Rectangle() {
		super();
	}
	public Rectangle(double width, double length) {
		this.setWidth(width);
		this.setLength(length);
		this.width = width;
	}
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.setWidth(width);
		this.setLength(length);
		this.color = color;
		this.setFilled(filled);
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return this.getLength()*this.getWidth();
	}
	public double getPrimeter() {
		return (this.length + this.width) *2;
	}
	public String toString() {
		return "Width = " + this.getWidth() +"\n" + "Length = " + this.getLength() + "\n"
				+ "Area = " + this.getArea() +"\n" + "Primeter = " + this.getPrimeter();
	}
	
}
