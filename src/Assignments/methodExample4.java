package Assignments;

//Write a method that takes an int array as a parameter and returns the largest number in the array.

public class methodExample4 {
	
	 public static int findMax( int a[])
	  {
	    int max = a[0];
	    for( int x : a)
	      if ( max < x )
	        max = x;
	    return max;
	  }

	  public static void main(String args[] )
	  {
	    int A[] = {1, 8, 7, 56, 90 };

	    int max = findMax(A);
	    System.out.printf("Maximum value is %d\n", max);

	  }
}

	/*
	     static int arr[] = {10, 324, 45, 90, 9808};
	       
	     // Method to find maximum in arr[]
	   public static int largest()
	     {
	         int i;
	           
	         // Initialize maximum element
	         int max = arr[0];
	        
	         // Traverse array elements from second and
	         // compare every element with current max  
	         for (i = 1; i < arr.length; i++)
	             if (arr[i] > max)
	                 max = arr[i];
	        
	         return max;
	     }
	       
	    public static void main(String[] args) 
	     {
	    	 
	         System.out.println("Largest in given array is " + largest());
	        }
	 
	    */





