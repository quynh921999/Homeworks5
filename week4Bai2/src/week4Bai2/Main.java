package week4Bai2;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(1.0);
		System.out.println(circle);
		
		Rectangle rectangle = new Rectangle(2.0, 3.0);
		System.out.println(rectangle);
		
		Square square = new Square(5.0);
		System.out.print(square);
	}
}
