package Assignments;

public class box {
	private double length;
	 private double width;
	 private double height;
	
		
	/*box(){
		length=0.0;
		width=0.0;
		height=0.0;
		
		System.out.println("Test no arguments");
		}*/
	
	//No Arguments - initializes all members to zero.
		box(){
			length=0.0;
			width=0.0;
			height=0.0;
		}
		
	//One Argument (For a cube: length=width=height) – initializes all members to the value passed
	box(double l){
		length = l;
		width = l;
		height = l;
		
		System.out.println("\nTest one arguments" + l + "*" + l+ "*" + l );
	}
	

	//Three Arguments for length, width, and height.
	box(double length,double width, double height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public void setLength(double box_length) {
		length=box_length;
	}
	public void setWidth(double box_width) {
		width=box_width;
	}
	
	public void setHeight(double box_height) {
		height=box_height;
	}
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
	
	//Method for Volume
	public double volume(double l,double w,double h){
		 double v =l*w*h;
		return v;
	}
	}

