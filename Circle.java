package lab8;

public class Circle extends Shape{
	private double radius;
	
	public Circle(int ID, int xLoc, int yLoc, double r) {
		super(ID, xLoc, yLoc);
		setRadius(r);
	}
	
	
	public void setRadius(double r) {
		if (r>=0)
			radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	

	public double getArea() {
		double area = Math.PI * (Math.pow(radius, 2));
		double roundArea = Math.round(area*100.0)/100.0;
		return roundArea;
	}//End Area
	
	public double getPerimeter() {
		double perimeter = 2 * Math.PI * radius;
		double roundPer = Math.round(perimeter*100.0)/100.0;
		return roundPer;
	}//End Perimeter
	
	public void scaleShape(double scaleFactor) {
		radius = radius * scaleFactor;
		setRadius(radius);
	}//End scaleShape
	
}//End Circle class
