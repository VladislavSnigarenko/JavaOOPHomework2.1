
public class Circle extends Shape {

	private Point a;
	private Point b;

	public Circle() {
	}

	public Circle(Point a, Point b) {
		this.a = a;
		this.b = b;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	@Override
	double getPerimetr() {
		return Math.PI * 2 * a.getDistance(b);
	}

	@Override
	double getArea() {
		return Math.PI * a.getDistance(b) * a.getDistance(b);
	}

	@Override
	public String toString() {
		return "Circle [a=" + a + ", b=" + b + "]";
	}

}
