package week4Bai2;

public class Shape {
	protected String color;
	private boolean filled = true;
	Shape() {}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.setFilled(filled);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return "Color: " + this.getColor();
	}
	
}
