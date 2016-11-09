
/**

 */
public class MediaLib
{
   
   public static void main()
    {
    /*Variables for Calculating Averages/Times. */
    double songCost = 0.0;
    double songCostAverage = 0.0;
    int songRating = 0;
    int songRatingAverage = 0;
    int movieHours = 0;
    int movieMinutes = 0;
    int[ ] top10 = null;
    top10 = new int[20];
    
    /*Song Array*/
    Song[] SongList = new Song[12];
    SongList[0] = new Song("Don't Talk To Much", 1.29, 8);
    SongList[1] = new Song("Bring On The Hospitality", .99, 7);
    SongList[2] = new Song("Renegade Bomb", 1.29, 10);
    SongList[3] = new Song("The Best of You", 1.29, 4);
    SongList[4] = new Song("Old Worlds Best of All", .99, 7);
    SongList[5] = new Song("Broken Thoughts", .99, 9);
    SongList[6] = new Song("Raking In The Fear", .99, 8);
    SongList[7] = new Song("Disco Riot", .99, 6);
    SongList[8] = new Song("What A Road", 1.29, 9);
    SongList[9] = new Song("Forever", .99, 7);
    SongList[10] = new Song("On a Warm Spring Day", 1.29, 9);
    SongList[11] = new Song("Spin and Shoot", 1.29, 8);
    
    /*Book Array*/
    Book[] BookList = new Book[1];
    BookList[0] = new Book("Color Out of Space", 8);
    
    /*Movie Array*/
    Movie[] MovieList = new Movie[3];
    MovieList[0] = new Movie("Heavy Metal", 9, 97);
    MovieList[1] = new Movie("Dangeresque", 10, 54);
    MovieList[2] = new Movie("Smile Guide: Return to Mushroomland", 7, 233);
    
    /*Text at the top.*/
    System.out.println("Welcome to your Media Library");
    System.out.println("Song List");

    /*For loops, printing out info for each list.*/
    for(int i=0; i<SongList.length; i++)
    {
    String t = SongList[i].getTitle();
    String r = String.valueOf(SongList[i].getRating());
    String p = String.valueOf(SongList[i].getPrice());
    System.out.println(SongList[i]);
    MediaFile.writeString("\n Title:" + t + "\n");
    MediaFile.writeString("Rating:" + r + "\n");
    MediaFile.writeString("Price:" +p + "\n" );
    System.out.println(t);
    System.out.println(r);
    System.out.println(p);
    songCost += SongList[i].getPrice();
    songRating += SongList[i].getRating();
    }
    /*Calculating and printing Average/Total Song Cost.*/
    songCostAverage = songCost/9;
    System.out.println("Total Song Cost: " + songCost);
    System.out.println("Average Song Cost: " + songCostAverage);
    songRatingAverage = songRating/9;
    System.out.println("Average Song Rating: " + songRatingAverage);
    System.out.println(" Top Songs \n-----------");
    for(int i=0; i<SongList.length; i++)
    {
    int red = SongList[i].getRating();
    if(red >= 8)
    {
    System.out.println("\n" + SongList[i].getTitle() + "(" + SongList[i].getRating() + ")");
    }
    }

    System.out.println("\nBook List");
    for(int i=0; i<BookList.length; i++)
    {
    System.out.println(BookList[i].getTitle()); 
    System.out.println(BookList[i].getRating());
    System.out.println(BookList[i]);
    }
    System.out.println("Movie List");
    for(int i=0; i<MovieList.length; i++)
    {
    System.out.println(MovieList[i].getTitle());
    
    /*Calculating and printing movie times.*/
    movieHours = MovieList[i].getDuration()/60 ;
    movieMinutes = MovieList[i].getDuration()%60;
    System.out.println(movieHours + ":" + movieMinutes);
    
    System.out.println(MovieList[i].getRating());
    System.out.println(MovieList[i]);
    }
    MediaFile.saveAndClose();
    }
}
