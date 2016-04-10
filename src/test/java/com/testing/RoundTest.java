package com.testing;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by Garrett on 3/19/2016.
 */
public class RoundTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RoundTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( RoundTest.class );
    }

    public void testCase1()
    {
        long actual = Math.round(0.0);
        long expected = 0L;
        Assert.assertEquals(actual, expected);
    }

    public void testCase2()
    {
        long actual = Math.round(1.5);
        long expected = 2L;
        Assert.assertEquals(actual, expected);
    }

    public void testCase3()
    {
        long actual = Math.round(-1.5);
        long expected = -1L;
        Assert.assertEquals(actual, expected);
    }
}
