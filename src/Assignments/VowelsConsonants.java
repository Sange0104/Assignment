package Assignments;
/*
 * Write a Java code to count number of vowels and consonants in a given String.
For ex: Given String – “Java”
Vowel count =2 Consonant count = 2

 */

public class VowelsConsonants {

	public static void main(String[] args) {
		String word = "Excellent";
		int v = 0;
		int c = 0;
		
		for(int i =0;i<word.length();i++) {
			
			if(word.charAt(i)=='a' ||word.charAt(i)=='e' ||word.charAt(i)=='i' ||word.charAt(i)=='o' ||word.charAt(i)=='u' ||
					word.charAt(i)=='A' ||word.charAt(i)=='E' ||word.charAt(i)=='I' ||word.charAt(i)=='O' ||word.charAt(i)=='U' ) {
				v++;
			}
			else {
				c++;
			}
			
			
		}//end of for loop
		
		System.out.println("The word entered is :" + word);
		System.out.println("The number of vowels in the word is : " + v);
		System.out.println("The number of consonants in the word is : " + c);
	}

}
