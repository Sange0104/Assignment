package Assignments;
/*
 * Write a java code to find the number of occurrences of a given character in a String.
For ex: Given String – “Java Programming”
              Given character – ‘a’
o/p: No of occurrences of a: 3

 */

public class noOfOccurence {

	public static void main(String[] args) {
		String word = "Java Programming";
		int n = 0;
		for(int i=0;i<word.length();i++) {
		
			if(word.charAt(i)=='a') {
				n++;
			}
		
		}
		int m=0;
		for(int i=0;i<word.length();i++) {
			
			if(word.charAt(i)=='m') {
				m++;
			}
		
		}
		
		System.out.println("The printed word is : JAva Programming");
		System.out.println("The number of letter a in the word is : " + n);
		System.out.println("The number of letter m in the word is : " + m);
	}
	

}
