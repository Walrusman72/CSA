

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Magpie3Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Magpie3Test
{
    /**
     * Default constructor for test class Magpie3Test
     */
    public Magpie3Test()
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
        Magpie3 magpie31 = new Magpie3();
        assertEquals("Hello, let's talk.", magpie31.getGreeting());
    }

    @Test
    public void testGetResponse()
    {
        Magpie3 magpie31 = new Magpie3();
        assertEquals("Why so negative?", magpie31.getResponse("no"));
        assertEquals("Tell me more about your family.", magpie31.getResponse("mother"));
        assertEquals("Tell me more about your family.", magpie31.getResponse("father"));
        assertEquals("Tell me more about your family.", magpie31.getResponse("sister"));
        assertEquals("Tell me more about your family.", magpie31.getResponse("brother"));
        assertEquals("Tell me more about your pets.",magpie31.getResponse("cat"));
        assertEquals("Tell me more about your pets.",magpie31.getResponse("cat"));
        assertEquals("He sounds like a good teacher.",magpie31.getResponse("Mr. Clevenger"));
        assertEquals("Say something, please.",magpie31.getResponse(""));
        assertEquals("Say something, please.",magpie31.getResponse(" "));
    }
}
