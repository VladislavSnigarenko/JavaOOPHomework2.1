
public class Quadrilateral extends Shape {

	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Quadrilateral() {
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

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	public Quadrilateral(Point a, Point b, Point c, Point d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	double getPerimetr() {
		return a.getDistance(b) + b.getDistance(c) + c.getDistance(d) + d.getDistance(a);
	}

	@Override
	double getArea() {
		return new Triangle(a, b, c).getArea() + new Triangle(a, c, d).getArea();
	}

	@Override
	public String toString() {
		return "Quadrilateral [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
}
