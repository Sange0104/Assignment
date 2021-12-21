package Assignments;

public class boxDemo {

	public static void main(String[] args) {
		
		box box1=new box();// --No argument constructor
		System.out.println("Result for No argument constructor");	
		System.out.println("length :" + box1.getLength());
		System.out.println("width :" + box1.getWidth());
		System.out.println("height :" + box1.getHeight());
		System.out.println(box1.volume(box1.getLength(), box1.getWidth(), box1.getHeight()));
		
				
		box box2 = new box(4); // one argument
		System.out.println("\nResult for one argument constructor");	
		System.out.println("Volume for one argument is:" +box2.volume(box2.getLength(), box2.getWidth(), box2.getHeight()));
		
		box box3 = new box(10.9,12.1,9.7); // three argument constructor
		System.out.println("\nResult for three argument constructor");	
		System.out.println("length :" + box3.getLength());
		System.out.println("width :" + box3.getWidth());
		System.out.println("height :" + box3.getHeight());
		System.out.println(box3.volume(box3.getLength(), box3.getWidth(), box3.getHeight()));
		
		}
}



