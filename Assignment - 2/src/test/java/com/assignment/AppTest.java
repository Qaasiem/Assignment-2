package com.assignment;


import junit.framework.Assert;
import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase {
    //App app = new App();

    public void testMultiplication() throws Exception {
        assertEquals(App.multiplication(2.0f, 2.0f), 4.0f);
    }

    public void testSubtraction() throws Exception {
        assertEquals(App.subtract(5, 3), 2);
    }

    public void testEquals() throws Exception {
        String abc = new String("Integers");
        assertEquals(App.equality(), abc);
    }

    public void testTruth() throws Exception {
        assertFalse(App.truth(0,4));
    }

    public void testFalse1() throws Exception {
        assertFalse(App.false1("Integers"));

    }

    public void testNullness() throws Exception
    {
        assertNull(App.Nullness());
    }

    public void testNotNullness() throws Exception
    {
        assertNotNull(App.notNullness());
    }

    public void testArrays() throws Exception
    {
        int[] arr = App.arrayT();
        assertEquals("Expected", App.arrayT(),arr);
    }

    public void testFail()
    {
        App.fail1();
    }

    public void testDisable()
    {
        App.disable();
    }

}

