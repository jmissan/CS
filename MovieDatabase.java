public class MovieDatabase
{  
   private GenLL<String> movies;

   public MovieDatabase()
   {
       movies = new GenLL<String>();
   }
   public void addMovie(String aMovie)
   {
	   movies.add(aMovie);
   }
   public void removeMovie(String aMovie)
   {
       movies.gotoHead();
       for(int i = 0; i < movies.getSize(); i++)
       {
           if(movies.getCurrent().equalsIgnoreCase(aMovie))
           {
               movies.removeCurrent();
           }
           movies.moveCurrentForward();                  
       }
   }
   public boolean findMovie(String aMovie)
   {
       movies.gotoHead();
       for(int i = 0; i < movies.getSize(); i++)
       {
           if(movies.getCurrent().equalsIgnoreCase(aMovie))
           {
        	   return true;
           }
           movies.moveCurrentForward();                  
       }
       return false;
   }
   public void printMovies()
   {
	   movies.print();
   }
}