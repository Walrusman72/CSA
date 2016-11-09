
/**
 * Write a description of class weatherConditionals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class weatherConditionals
    {
    public static String getWA(int temp, String desc, boolean wind)
    {
       if (temp <= 30) return "Mayhaps it is a mite to cold. Stay inside!";
       if (wind)
       {
           if (temp <= 32 && temp >=31) return "Right now it's " + temp + " degrees, but with wind chill it feels like even less. Don't go out.";
           if (temp < 32) return "Sure, go out. It should be fine!";
       }
       if (desc == "Snow" && temp >= 60) return "Ok, so there is Snow and it's " + temp + " Degrees out. Nope, nothing strange here.";
       return desc + " and " + temp + " Degrees. Go ahead and go out.";
    }
    public static String getHA(int temp, int windci, int humid, String desc)
    {
    if (temp <= 32) 
    {
    if (windci <=5) return "Look, it's going chilly. Take a sweater.";
    if (windci >5) return "It's probably best to stay inside and avoid freezing to death.";
    }
    if (temp >=33 && temp <=85)
    {
        if (desc == "Snowy") 
        {
            if (windci <=5) return "Walking in a snowstorm is risky, but now might be the time to risk it.";
            if (windci >5) return "It's probably best to stay inside and avoid freezing to death in a Blizzard.";
        }
        if (desc == "Sunny") 
        {
           if (humid <=50) return "Great day to enjoy nature. Walk it bro.";
           if (humid > 50) return "You might get a bit sweaty, but go for it.";
        }
        if (desc == "Rainy") return "Bring an umbrella, otherwise enjoy.";
        else return "Weird weather is out. Walk with caution.";
    }
    if (temp >=86 && temp <=110)
    {
        if (desc == "Sunny") return "Things are looking hot today. You might try and avoid this.";
        if (desc == "Rainy") return "The weather is hot, but the rain is cool. Great time for a hike!";
        else return "Weird weather is out. Walk with caution.";
    }
    if (temp > 110) return "Too hot. No go dude.";
    return "I can't tell what weather it is right now. Why don't you go check for me?";
    }
}
