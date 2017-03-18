package com.module;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testNotNullness() throws Exception
    {
        assertNotNull(App.notNullness());
    }
}
