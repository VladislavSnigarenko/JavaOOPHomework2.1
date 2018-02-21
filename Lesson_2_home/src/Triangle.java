
public class Triangle extends Shape {

	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	double getPerimetr() {
		return a.getDistance(a) + b.getDistance(c) + c.getDistance(a);
	}

	@Override
	double getArea() {
		double p = getPerimetr() / 2;
		return Math.sqrt(p * (p - a.getDistance(b)) * (p - b.getDistance(c)) * (p - c.getDistance(a)));
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
