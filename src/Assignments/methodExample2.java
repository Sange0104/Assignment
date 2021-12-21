package Assignments;

import java.util.Scanner;

//  Write a method that returns true if a number passed to it is even else it returns false.
public class methodExample2 {
	
	public static void find_even (int num) {
	if (num%2 == 0) {
		System.out.println("It is a Even number");
	}
	else
		System.out.println("It is a Odd number");
	}

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number to check odd or even :");
		int n =input.nextInt();
		find_even(n);
		input.close();
	}

}
