package cz.fit.cvut.dpo.mvc.objects;

public class Circle extends AbstractShape {
	private int radius;

	
	public Circle(Position position, int radius) {
		super(position);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
