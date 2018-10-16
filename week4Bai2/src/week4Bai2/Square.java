package week4Bai2;

public class Square extends Rectangle{
	private double side;
	public Square() {}
	public Square(double side) {
		this.setSide(side);
	}
	public Square(double side, String color, boolean filled) {
		this.setSide(side);
		this.setColor(color);
		this.setFilled(filled);
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void setWidth(double side) {
		this.setWidth(side); 
	}
	public void setLength(double side) {
		this.setLength(side);
	}
	public String toString() {
		return "Side = " + this.getSide() ;
	}
}
