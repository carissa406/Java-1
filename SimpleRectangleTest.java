
public class SimpleRectangleTest {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		
		System.out.println("Rectangle 1: ");
		System.out.println("Width: " + rec1.width);
		System.out.println("Height: " + rec1.height);
		System.out.println("Area: " + rec1.getArea());
		System.out.println("Perimeter: " + rec1.getPerimeter() + "\n");
		
		System.out.println("Rectangle 2: ");
		System.out.println("Width: " + rec2.width);
		System.out.println("Height: " + rec2.height);
		System.out.println("Area: " + rec2.getArea());
		System.out.println("Perimeter: " + rec2.getPerimeter());

	}
}

class Rectangle {
	
	double width = 1;
	double height = 1;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2*width + 2*height;
	}
}
