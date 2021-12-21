package Assignments;

/*Write an overloaded method that takes two parameters and return if they have equal value or not. For eg, if you pass two Strings, the 
method should return true if the Strings are equal else false. If you pass two integers, the method should return if they are equal else 
false.*/
public class methodOverloadEx2 {

	public static void main(String[] args) {
		
		int num1 =10 , num2 =20;
		String S1 ="top";
		String S2 ="top";
		
	System.out.println("enter the first number  : " +num1);
	System.out.println("enter the second number  : " +num2);
	
	isEqual(num1,num2);
	
	
	System.out.println();
	
	System.out.println("Check if the text is equal :" +isEqual(S1,S2)); 
	
		
	}

	public static void isEqual(int n1, int n2)
	{
		if (n1 == n2) {
			System.out.println("the two integer values are equal");
		}
		else
		{
			System.out.println("the two integer values are not equal");
			
		}
		
	 
	 }
	
	public static boolean isEqual(String one , String two) {
		return one.equals(two);
	}}



/*
 * public class StringEquality {
    public static void main(String args[]) {
        String str1, str2;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter first String");
        str1 = scanner.nextLine();
 
        System.out.println("Enter second String");
        str2 = scanner.nextLine();
        // Comparing two input string
        if (str1.equals(str2))
            System.out.print("Equal Strings");
        else
            System.out.print("UnEqual Strings");
    }
}*/
