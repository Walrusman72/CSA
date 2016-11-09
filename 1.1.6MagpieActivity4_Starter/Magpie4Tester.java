

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Magpie4Tester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Magpie4Tester
{
    /**
     * Default constructor for test class Magpie4Tester
     */
    public Magpie4Tester()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
     @Test
    public void testGetGreeting()
    {
        Magpie4 magpie41 = new Magpie4();
        assertEquals("Hello, let's talk.", magpie41.Greeting());
    }
    
    @Test
    public void testGetResponse()
    {
        Magpie4 magpie41 = new Magpie4();
        assertEquals("Say something, please.",magpie41.getResponse(""));
        assertEquals("Why so negative?", magpie41.getResponse("no"));
        assertEquals("Tell me more about your family.", magpie41.getResponse("mother"));
        assertEquals("Tell me more about your family.", magpie41.getResponse("father"));
        assertEquals("Tell me more about your family.", magpie41.getResponse("sister"));
        assertEquals("Tell me more about your family.", magpie41.getResponse("brother"));
        assertEquals("What would it mean to go?",magpie41.getResponse("I want to go"));
        assertEquals("Would you really be happy if you had ice cream?",magpie41.getResponse("I want ice cream"));
        assertEquals("What makes you think that I like you?",magpie41.getResponse("do you like me"));
        assertEquals("Why do you like me?",magpie41.getResponse("i like you"));
    }
    
    
}
