/*
 * Written by Joey Missan
 */
import java.util.Scanner;
import java.util.*;
public class MovieDatabaseFrontEnd {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		MovieDatabase movieList = new MovieDatabase();
		int n = 0;
		while (n != 9)
		{
			System.out.println("Welcome to the Movie Database!");
			System.out.println("Enter 1: to Add a Movie");
			System.out.println("Enter 2: to Remove a Movie by Title");
			System.out.println("Enter 3: to Search for Movies by Title");
			System.out.println("Enter 4: to Print all Movies");
			System.out.println("Enter 9: to Quit");
			n = scan.nextInt();
			if (n != 1 && n != 2 && n != 3 && n != 4 && n != 9)
			{
				System.out.println("Invalid Input");
			}
			if (n == 1)
			{
				System.out.println("Enter the movie's name");
				String movieName = scan.nextLine();
				scan.nextLine();
				movieList.addMovie(movieName);
			}
			if (n == 2)
			{
				System.out.println("Enter the movie's name to remove");
				String movieName = scan.nextLine();
				scan.nextLine();
				movieList.removeMovie(movieName);
			}
			if (n == 3)
			{
				System.out.println("Enter the movie's name to search the database");
				String movieName = scan.nextLine();
				scan.nextLine();
				if (movieList.findMovie(movieName))
					System.out.println("Movie has been found!");
				else {
					System.out.println("Movie not found!");
				}
			}
			if (n == 4)
			{
				movieList.printMovies();
				scan.nextLine();
			}
		}
	}
}
