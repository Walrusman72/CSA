
/**
 * Write a description of class Movie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movie
{
    private int rating;
    private String title;
    private int duration;
    private double price = 0.0; 
    private boolean favorite;
    
    
    /**
     * Constructor for objects of class Song
     */
    public Movie()
    {
       title="";
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String t)
    {
         title = t; 
    }
     public int getRating()
    {
        return rating;
    }
    public void setRating(int r)
    {
         rating = r; 
    }
         public double getPrice()
    {
        return price;
    }
    public void setPrice(double p)
    {
         price = p; 
    }
    public void addToFavorites() 
    {
    favorite = true;
    }
    public int getDuration()
    {
    return duration;
    }
    public Movie(String title, int rating, int duration) 
    {
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }
}
