package com.testing;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MaxTest extends TestCase {

	 /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MaxTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MaxTest.class );
    }
    
    public void testCase1()
    {
        double actual = Math.max(1.0,1.5);
        double expected = 1.5;
        Assert.assertEquals(actual, expected);
    }
    public void testCase2()
    {
        double actual = Math.max(-0.0,0.0);
        double expected = 0.0;
        Assert.assertEquals(actual, expected);
    }
    public void testCase3()
    {
        double actual = Math.max(Double.NaN,5);
        double expected = Double.NaN;
        Assert.assertEquals(actual, expected);
    }
}
