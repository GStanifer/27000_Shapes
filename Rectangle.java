package lab8;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	//Constructor1
	public Rectangle(int ID, int xLoc, int yLoc, double l, double w){
		super(ID, xLoc, yLoc);
		setLength(l);
		setWidth(w);
	}
	
	//Methods to set/get length
	public void setLength(double l) {
		if (length >=0)
			length = l;
	}
	
	public double getLength() {
		return length;
	}
	
	//Methods to set/get width
	public void setWidth(double w) {
		if (width >= 0)
			width = w;
	}
	
	public double getWidth() {
		return width;
	}

	public double getArea() {
		double area = width * length;
		double roundArea = Math.round(area*100.0)/100.0;
		return roundArea;
	}//End Area
	
	public double getPerimeter() {
		double perimeter = (width*2) + (length*2);
		double roundPer = Math.round(perimeter*100.0)/100.0;
		return roundPer;
	}//End Perimeter
	
	public void scaleShape(double scaleFactor) {
		length = length * scaleFactor;
		width = width * scaleFactor;
		setLength(length);
		setWidth(width);
	}//End scaleShape
	
}//End Rectangle class
