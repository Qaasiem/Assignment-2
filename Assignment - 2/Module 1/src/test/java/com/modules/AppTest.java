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
    public void testSubtraction() throws Exception {
        assertEquals(App.subtract(5, 3), 2);
    }
}
