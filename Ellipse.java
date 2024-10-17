
public class Ellipse extends Shape {

	private final double a;
	private final double b;
	private static String message = "Nonpositive value(s) provided for the constructor";
	private static String message2 = "Semi-major axis length cannot be less than semi-minor axis length";
	
	public Ellipse(double a, double b) {
		if(a <= 0 || b <= 0) {
			throw new IllegalArgumentException(message);
		}if(a < b) {
			throw new IllegalArgumentException(message2);
		}
			this.a = a;
			this.b = b;
		}
	
	@Override
	public double getArea(){
		return Math.PI * a * b;
	}
	@Override
	public double getPerimeter() {
		return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	
	}
	
	
	

