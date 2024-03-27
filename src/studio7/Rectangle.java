package studio7;

public class Rectangle {
	
	
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double Area() {
		return length*width;
	}
	public double Perimeter() {
		return 2*length + 2*width;
	}
	public boolean Square() {
		if (length == width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String Compare(Rectangle r2) {
		if (r2.Area() < length*width) {
			return "second rectangle is smaller";
		}
		else if (r2.Area() > length*width) {
			return "second rectangle is bigger";
		}
		else {
			return "two rectangles are equal is size";
		}
	}
	
	
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(5.0,6.0);
		Rectangle r2 = new Rectangle(7.0,10.0);
		System.out.println("area: " + r1.Area());
		System.out.println("perimeter: " + r1.Perimeter());
		System.out.println("this is a square: " + r1.Square());
		System.out.println(r1.Compare(r2));
		

	}


}
