package lab8;

public class RightTriangle extends Shape{
	
	private double base;
	private double height;
	//Hyp is computed value
	private double hypotenuse;
	
	
	public RightTriangle(int ID, int xLoc, int yLoc, double b, double h) {
		super(ID, xLoc, yLoc);
		setValues(b,h);
		hypotenuse = Math.sqrt((b*b)+(h*h));
	}
	
	
	public void setValues(double b, double h) {
		if (b >= 0.0)
			base = b;
		if (h >= 0.0)
			height = h;
		hypotenuse = Math.sqrt( Math.pow(base, 2) * Math.pow(height, 2));
		
	}
	
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getHypotenuse() {
		double roundHyp = Math.round(hypotenuse*100.0)/100.0;
		return roundHyp;
	}
	
	
public double getArea() {
	double area = .5* base * height;
	double roundArea = Math.round(area*100.0)/100.0;
	return roundArea;
	}//End Area
	
	public double getPerimeter() {
		double perimeter = base + height + hypotenuse;
		double roundPer = Math.round(perimeter*100.0)/100.0;
		return roundPer;
	}//End Perimeter
	
	public void scaleShape(double scaleFactor) {
		base = base * scaleFactor;
		height = height * scaleFactor;
		setValues(base, height);
		hypotenuse = Math.sqrt( Math.pow(base, 2) * Math.pow(height, 2));
	}//End scaleShape
	
}//End RT class
