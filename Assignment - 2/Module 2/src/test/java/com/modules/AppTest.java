package com.modules;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testEquals() throws Exception {
        String abc = new String("Integers");
        assertEquals(App.equality(), abc);
    }
}
