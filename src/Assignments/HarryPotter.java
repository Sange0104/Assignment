package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class HarryPotter {

	public static void main(String[] args) {
		
		
		// 1. How many years elapsed between first and last movie of Harry Potter?
				int firstMovie = 2001;
				int lastMovie = 2011;
				int yearsElapsed = lastMovie - firstMovie;
				System.out.println("The number of years elapsed is : " + yearsElapsed + " Years");
		/*		
		2. Calculate using formula and print answer in years and months. 
		* Approx years for a movie release = (Last movie Release Year – First Movie Release year) / Total Number of Movies 
				
				int totalNoOfMovies =8;
				int diffinReleaseYears = lastMovie - firstMovie ;
				int movieReleaseinYears = ((diffinReleaseYears*12) / totalNoOfMovies)/12;
				int movieReleaseinMonths = ((diffinReleaseYears*12) /  totalNoOfMovies)%12;
				System.out.println("Approximate release of movie in years " + movieReleaseinYears +  " Years" );
				System.out.println("   Approximate release of movie in months " + movieReleaseinMonths +  " Months" );
				
		// 3. Get a number as input from user and print the name of the movie
				
			    Scanner input = new Scanner(System.in);
				System.out.println("Enter the movie number # ");
				int MovieNo = input.nextInt();
				input.close();
				
				if (MovieNo ==1)
				{ 
					System.out.println("Harry Potter and the Philosopher's Stone");
				}
				else if (MovieNo ==2)
				{
					System.out.println("Harry Potter and the Chamber of Secrets");
				}
				else if (MovieNo ==3)
				{
					System.out.println("Harry Potter and the Prisoner of Azkaban ");
				}
				else if (MovieNo ==4)
				{
					System.out.println("Harry Potter and the Goblet of Fire");
				}
				else if (MovieNo ==5)
				{
					System.out.println("Harry Potter and the Order of the Phoenix ");
				}
				else if (MovieNo ==6)
				{
					System.out.println("Harry Potter and the Half-Blood Prince");
				}
				else if (MovieNo ==7)
				{
					System.out.println("Harry Potter and the Deathly Hallows – Part 1");
				}
				else if (MovieNo ==8)
				{
					System.out.println("Harry Potter and the Deathly Hallows – Part 2");
				}
						
				else
				{
					System.out.println("No movie available for this number");
				}
				
				input.close(); 
				
				
				
		//4. If user enters input as 1, print ”First movie”, 8, print “Last movie”. For anything else, print “Not First or Last movie”
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the movie number # ");
				int MovieNo = input.nextInt();
				input.close();
				
				if (MovieNo ==1)
				{ 
					System.out.println("First Movie");
				}
				else if (MovieNo ==8)
				{
					System.out.println("Last Movie");
				}
				else
				{
					System.out.println("Not first or Last movie");
				}
				
				input.close();
				
		//5. Keep getting input from user and print the name of the movie till the user enters an invalid input.
				
				Scanner input = new Scanner(System.in);
				String movieNames [] = {"Harry Potter and the Philosopher's Stone","Harry Potter and the Chamber of Secrets","Harry Potter and the Prisoner of Azkaban ",
						"Harry Potter and the Goblet of Fire","Harry Potter and the Order of the Phoenix","Harry Potter and the Half-Blood Prince","Harry Potter and the Deathly Hallows – Part 1 ",
						"Harry Potter and the Deathly Hallows – Part 2" };
				boolean valid = true;
				int movieNumber = 0;
				while(valid) {
					movieNumber = input.nextInt();
					if(movieNumber >= 1 && movieNumber <9) {
						
					System.out.println(movieNames[movieNumber-1]);
					
					}
					else {
						System.out.println("No movie available");
						valid = false;
					}
					
				}
				input.close();
				
				*/
				
		// 6.  Store all the data into respective arrays.

				int movieNumberarray [] = {1,2,3,4,5,6,7,8};
				String movieNamearray [] = {"Harry Potter and the Philosopher's Stone","Harry Potter and the Chamber of Secrets","Harry Potter and the Prisoner of Azkaban ","Harry Potter and the Goblet of Fire","Harry Potter and the Order of the Phoenix","Harry Potter and the Half-Blood Prince","Harry Potter and the Deathly Hallows – Part 1 ","Harry Potter and the Deathly Hallows – Part 2" };
				int releaseYeararray [] = {2001,2002,2004,2005,2007,2009,2010,2011};
				
				
		// 7. Create a single for loop to print all the data in the format [Movie Number, Movie name, Year Of Release]
				
				System.out.println("7. ForLoop"); // Printing the Pet name
				for (int i=0; i < movieNamearray.length; i++) {
				System.out.println ("The Movie Number, Movie name and Year Of Release at Index "+i+" is : "+ movieNumberarray[i] + ", " +  movieNamearray[i] + ", " + releaseYeararray [i]);
				}// End of For Loop
				
				
				
				
		// 8. Keep getting input from user for 5 times. Store all the inputs given by the user in an array. Loop through the array using For Each loop and print all the movie names entered by the user
				 
					Scanner scan = new Scanner(System.in);
				    
				    int n = 5; //Ensures you take an integer
				    System.out.println("Enter the 5 movie names: ");

				    String [] names = new String[n];
				    //store the names in an array
				    
				    for (int i = 0; i < names.length; i++){
				        names[i] = scan.nextLine();
				        }
				    System.out.println(Arrays.toString(names));
					   
				    //sequentially print the names and upperCase them    
				    for (String i : names){
				        System.out.println(i.toUpperCase());
				        }

				    scan.close();

						
				
			} //End of method main

		} // End of Class

