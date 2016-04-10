package com.testing;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by Garrett on 3/19/2016.
 */
public class NextAfterTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NextAfterTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( NextAfterTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCase1()
    {
        double actual = Math.nextAfter(new Double(0.0/0.0), 1.0);
        Assert.assertTrue(Double.isNaN(actual));
    }

    public void testCase2()
    {
        double actual = Math.nextAfter(1.0, 1.0);
        double expected = 1.0;
        Assert.assertEquals(actual, expected);
    }

    public void testCase3()
    {
        double actual = Math.nextAfter(0.0, 1.0);
        double expected = 4.9E-324;
        Assert.assertEquals(actual, expected);
    }

    public void testCase4()
    {
        double actual = Math.nextAfter(-1.0, 1.0);
        double expected = -0.9999999999999999;
        Assert.assertEquals(actual, expected);
    }

    public void testCase5()
    {
        double actual = Math.nextAfter(2.0, 1.0);
        double expected = 1.9999999999999998;
        Assert.assertEquals(actual, expected);
    }

    public void testCase6()
    {
        double actual = Math.nextAfter(-2.0, -3.0);
        double expected = -2.0000000000000004;
        Assert.assertEquals(actual, expected);
    }

    public void testCase7()
    {
        double actual = Math.nextAfter(0.0, -1.0);
        double expected = -4.9E-324;
        Assert.assertEquals(actual, expected);
    }
}
