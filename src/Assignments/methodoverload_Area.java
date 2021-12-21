package Assignments;

/*
 * Write an overloaded method - area(), one to find area of a rectangle and takes its length and width as parameter and the other 
one to find area of a circle, takes its radius as a parameter. 
 Area of rectangle = length*width
 Area of circle= 3.14*r*r
 */

public class methodoverload_Area {

	
	public static void main(String[] args) {
		int length = 4 , width = 5, radius =6;
		int areaofRectangle = area(length, width);
		System.out.println("The area of rectangle is : " + length + "*" + width + "=" + areaofRectangle);
		
		float areaofCircle = area(radius);
		System.out.println("The area of circle is : " + areaofCircle);

	}

	public static int area(int l, int w) {
		int area = l*w;
		return area;
	}
	
	public static float area(float r) {
		float area_circle = (float) (3.14*r*r);
		return area_circle;
		
	}
}
