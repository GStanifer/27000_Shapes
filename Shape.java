package lab8;

public abstract class Shape {
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract void scaleShape(double scaleFactor);
	
	public Shape(int ID, int xLoc, int yLoc) {
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.ID = ID;
	}
	
	static double scaleFactor = 1;
	private int ID;
	private int xLoc;
	private int yLoc;
	
	public void setID(int id) {
		if (id > 0)
			ID = id;
	}
	
	public void setxLoc(int x) {
		xLoc = x;
	}
	
	public void setyLoc(int y) {
		yLoc = y;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getxLoc() {
		return xLoc;
	}
	
	public int getyLoc() {
		return yLoc;
	}
	
	public static void setSf(double scaleFactor) {
		if (scaleFactor > 0)
			Shape.scaleFactor = scaleFactor;
	}
	
	public static double getSf() {
		return scaleFactor;
	}
	
	
}//End shape class
