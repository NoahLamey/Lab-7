
public class IsoscelesTrapezoid extends Polygon {
	private final double top;
	private final double leg;
	private final double base;
	
	
	public IsoscelesTrapezoid(double top, double base, double leg) {
		super(top, base, leg, leg);
		this.top = top;
		this.leg = leg;
		this.base = base;
	}
	
	public double getTop() {
		return top;
	}

	public double getLeg() {
		return leg;
	}

	public double getBase() {
		return base;
	}

	public Rectangle getCenterRectangle() {
		double height = Math.sqrt((leg * leg) - Math.pow((base - top) / 2, 2));
		if(top < base) {
		return new Rectangle(top, height);
		}
		return new Rectangle(base, height);
		}
	
	@Override
	public double getArea() {
		double height = Math.sqrt(leg * leg - (base - top) * (base - top) / 4);
		return ((top + base) / 2)* height;
	}
}
