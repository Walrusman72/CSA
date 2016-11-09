
/**
 * Write a description of class ArrayMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{
    public void sampleMethod()
    {
    String[] sharingFriends = {"Paladin", "Magi","Brute", "Ranger", "Bard"};
    Song[] topTenSongs = new Song[10];
    topTenSongs[0] = new Song("Don't Talk To Much");
    topTenSongs[1] = new Song("Bring On The Hospitality");
    topTenSongs[2] = new Song("Renegade Bomb");
    topTenSongs[3] = new Song("The Best of You");
    topTenSongs[4] = new Song("Old Worlds Best of All");
    topTenSongs[5] = new Song("Broken Thoughts");
    topTenSongs[6] = new Song("Raking In The Fear");
    topTenSongs[7] = new Song("Disco Riot");
    topTenSongs[8] = new Song("What A Road");
    topTenSongs[9] = new Song("Forever");
    int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
    int dBP = 0;
    for (int i = 0; i < 5; i++)
    {
        System.out.println(sharingFriends[i]);
    }
    for (Song s: topTenSongs)
    {
        System.out.println(s.getTitle());
    }
    /* System.out.println("—BEFORE--");
    for (Song changeSong : topTenSongs) 
    { 
         changeSong.setTitle("test");
    }
        // show the array
    System.out.println("—AFTER--");
        for (Song showSong : topTenSongs) 
    {
         System.out.println(showSong.getTitle());
    }
        for (Song changeSong: topTenSongs) 
    {
        changeSong = new Song("test");
        System.out.println(changeSong.getTitle());
    } */
    for (int i = 0; i < daysBtwnPurchase.length; i++)
    {
        dBP += daysBtwnPurchase[i];
    }
    dBP = dBP / daysBtwnPurchase.length;
    System.out.println(dBP);
    
    }
}
