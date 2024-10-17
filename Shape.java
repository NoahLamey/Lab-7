
public abstract class Shape implements Comparable<Shape> {

	private static int nextID = 1;
	private int id;
	
	public Shape() {
		this.id = nextID;
		nextID++;
	}
	public int getID() {
		return id;
	}
	public abstract double getPerimeter();
	public abstract double getArea();
	
	public int compareTo(Shape other) {
		String currentType = this.getClass().getName();
		String otherType = other.getClass().getName();
		int compareType = currentType.compareTo(otherType);
		
		if(compareType != 0) {
			return compareType;
		}
		double perimeter = this.getPerimeter() - other.getPerimeter();
		if(perimeter != 0) {
			return (int) Math.signum(perimeter);
		}
		double area = this.getArea() - other.getArea();
		return (int) Math.signum(area);
	}
	
	
	
	
	@Override
	public String toString() {
		return "<"
				+ getClass().getName()
				+ ", ID: " + id
				+ ", PERIMETER: " + String.format("%.1f", getPerimeter())
				+ ", AREA: " + String.format("%.1f", getArea())
				+ ">";
	}
	
	}
