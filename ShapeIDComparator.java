import java.util.Comparator;

public class ShapeIDComparator implements Comparator<Shape> {
	@Override
	public int compare(Shape a, Shape b) {
		return Integer.compare(a.getID(), b.getID());
	}
}
