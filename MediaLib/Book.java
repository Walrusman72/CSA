
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book
{
    private int rating;
    private String title;
    private double price = 0.0; 
    private boolean favorite;
    
    
    /**
     * Constructor for objects of class Song
     */
    public Book()
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
     public Book(String title, int rating) 
    {
        this.title = title;
        this.rating = rating;
    }
}
