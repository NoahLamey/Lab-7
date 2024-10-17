

public abstract class Polygon extends Shape{
	private double perimeter;
	
	protected Polygon(double... sides) {
		super();
		double sum = 0;
		if(sides == null) {
			throw new IllegalArgumentException("null sides");
		}
		else if (sides.length < 3) {
			throw new IllegalArgumentException("Invalid number of sides: " + sides.length);
		}else {
		for (double side : sides) {
			if(side <= 0) {
				throw new IllegalArgumentException("Nonpositive side: " + side);
			}
			sum += side;
		}
		for(double side : sides) {
			if(side >= sum - side) {
	                throw new IllegalArgumentException("Polygon inequality violated: " + side + " >= " + (sum - side));
	            }
	        }
		}
	perimeter = sum;
	}

		
	    
	@Override
			public double getPerimeter() {
				return perimeter;
			}
	}	
