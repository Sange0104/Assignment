package Assignments;
/* Today's Challenge:  Check if the Sentence Is Pangram.
A pangram is a sentence where every letter of the English alphabet appears at least once.
Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet(a-z).
Example 2:
Input: sentence = ""numpyninja
Output: false*/
public class Panagram {
	public static boolean isPanagram(String s) {
		s = s.toLowerCase();
		int letters = 0;
		for(int i = 0; i<26;i++) {
			
			if(s.contains("" + ((char)(97+i)))) {
				letters++;
			}
		}
		
		if(letters == 26) {
			return true;
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =   "Numpy Ninja"   ;             //"thequickbrownfoxjumpsoverthelazydog";
		System.out.println(isPanagram(s));
		
	}

}
