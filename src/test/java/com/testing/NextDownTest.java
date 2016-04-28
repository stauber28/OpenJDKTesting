package com.testing;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class NextDownTest extends TestCase {

	 /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NextDownTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( NextDownTest.class );
    }

    public void testCase1()
    {
        double actual = Math.nextDown((Double.NEGATIVE_INFINITY));
        double expected = (Double.NEGATIVE_INFINITY);
        Assert.assertEquals(actual, expected);
    }
    public void testCase2()
    {
        double actual = Math.nextDown(0.0);
        double expected = -Double.longBitsToDouble(0x1L);
        Assert.assertEquals(actual, expected);
    }

    public void testCase3()
    {
        double actual = Math.nextDown(12.0);
        double expected = 11.999999999999998;
        Assert.assertEquals(actual, expected);
    }
}

