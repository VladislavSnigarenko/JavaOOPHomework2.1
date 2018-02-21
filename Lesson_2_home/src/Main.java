
public class Main {

	public static void main(String[] args) {

		Shape MyTriangle = new Triangle(new Point(-1, 2), new Point(0, 10), new Point(5, 2));
		System.out.println(MyTriangle);
		System.out.println("Perimetr = " + MyTriangle.getPerimetr());
		System.out.println("Area = " + MyTriangle.getArea());

		System.out.println();
		
		Circle myCircle = new Circle(new Point(-1, 2), new Point(5, 5)); 
		System.out.println(myCircle);
		System.out.println("Perimetr = " + myCircle.getPerimetr());
		System.out.println("Area = " + myCircle.getArea());

		System.out.println();

		Quadrilateral myQuadrilateral = new Quadrilateral(new Point(-2, -2), new Point(-5, 12), new Point(3, 7), new Point(1, -4));  
		System.out.println(myQuadrilateral);
		System.out.println("Perimetr = " + myQuadrilateral.getPerimetr());
		System.out.println("Area = " + myQuadrilateral.getArea());
		
		// Work with board
		System.out.println();
		System.out.println("Work with board");
		
		Board myBoard = new Board("My board");
		myBoard.placeOnePart(0, myCircle); // good
		myBoard.placeOnePart(0, MyTriangle); // bad

		myBoard.placeOnePart(2, myCircle); // good
		myBoard.placeOnePart(3, myQuadrilateral); // good
		myBoard.placeOnePart(-3, myQuadrilateral); // Error
		myBoard.placeOnePart(100, myQuadrilateral); // Error
		
		myBoard.getInformation();
		
	}

}
