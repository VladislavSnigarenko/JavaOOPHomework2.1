
public class Board {

	private String name;
	private Shape[] boardParts = new Shape[4];

	public Board() {
	}

	public Board(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void placeOnePart(int index, Shape shape) {

		if (!checkIndex(index))
			return;

		if (boardParts[index] != null)
			System.out.println("Part : " + index + " is busy.");
		else
			boardParts[index] = shape;
	}

	public void clearOnePart(int index) {

		if (!checkIndex(index))
			return;

		if (boardParts[index] == null)
			System.out.println("Part : " + index + " not is busy.");
		else
			boardParts[index] = null;

	}

	private boolean checkIndex(int index) {
		if (index < 0 || index > boardParts.length) {
			System.out.println("Out-of-bounds array.");
			return false;
		}
		return true;
	}

	public void getInformation() {
		String result = "\nBoard : " + name + "\n";
		Double totalArea = 0.;
		for (int i = 0; i < boardParts.length; i++) {

			if (boardParts[i] == null)
				result = result + "Patr [" + i + "] not busy.\n";
			else {
				totalArea = totalArea + boardParts[i].getArea();
				result = result + "Patr [" + i + "] contains " + boardParts[i].getClass().getName() + "\n";
			}
		}
		result = result + ", total area = " + totalArea;
		System.out.println(result);
	}

}
