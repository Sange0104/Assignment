package Assignments;

//Write a method that takes a String as a parameter and returns true if String is palindrome else return false
public class methodExample3 {

	static boolean isPalindrome(String str)
    {
 
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;  //i = m ,j=m
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
        
        
        // Given string is a palindrome
        return true;
        
    }
 
    // Method 2
    // main driver method
    public static void main(String[] args)
    {
        // Input string
        String str1 = "mom";
        String str2 = "not";
        
 
        // passing bool function till holding true
        //For String 1
        System.out.println("String 1 :");
        if (isPalindrome(str1))
        
            // It is a palindrome
            System.out.print("True. It is a Palindrome");
        else
 
            // Not a palindrome
            System.out.print("False. It is not a Palindrome");
        
        System.out.println();
        
      //For String 2
        System.out.println( " String 2 :");
        if (isPalindrome(str2))
 
            // It is a palindrome
            System.out.print("True. It is a Palindrome");
        else
 
            // Not a palindrome
            System.out.print("False. It is not a Palindrome");
        
    }
}