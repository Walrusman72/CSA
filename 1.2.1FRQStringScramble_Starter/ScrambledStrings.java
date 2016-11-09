import java.util.List;
import java.util.ArrayList;

public class ScrambledStrings
{
    /********************** Part (a) *********************/

    /** Scrambles a given word.
     *  @param word the word to be scrambled
     *  @return the scrambled word (possibly equal to word)
     *  Precondition: word is either an empty string or contains
     *    only uppercase letters.
     *  Postcondition: the string returned was created from word
     *      as follows:
     *   - the word was scrambled, beginning at the first letter
     *      and continuing from left to right
     *   - two consecutive letters consisting of "A" followed by
     *        a letter that was not "A" were swapped
     *   - letters were swapped at most once
     */
    public static String scrambleWord(String word)
    { 
      /*String sWord = "";
      if (1 >= word.length())
      {
      return word;
      }
      else
      {

      for (int i=0; i>=word.length()-1; i++)
      {
      String red = word.substring(i,i+1);
      if (red == "A")
      {
      String blue = word.substring(i+1,i+2);
      sWord += blue;
      }
      sWord += red;
      }
      word = sWord;
      return word;
      }
    }*/
    int pos = 0;
    String scramble = "";
    while (pos < word.length()-1)
    {
    String s1 = word.substring(pos,pos+1);
    String s2 = word.substring(pos+1,pos+2);
    if (s1.equals("A") && !s2.equals("A"))
    {
    scramble += s2 +s1;
    pos += 1;
    }
    else
    {
    scramble += s1;
    }
    pos +=1;
    }
    scramble += word.substring(pos);
    return scramble;
}

    /********************** Test *********************/
    public static void main(String[] args)
    {
        System.out.println("\nTesting Part (a):\n");

        String[] words = {"TAN", "ABRACADABRA", "WHOA",
                "AARDVARK", "EGGS", "A", ""};
        for (String word : words)
            System.out.println(word + " becomes " + scrambleWord(word));
    }
}
