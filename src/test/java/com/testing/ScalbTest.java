package com.testing;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ScalbTest extends TestCase{
	
	 /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ScalbTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ScalbTest.class );
    }

    public void testCase1()
    {
        double actual = Math.scalb(1,-3);
        double expected = .0125;
        Assert.assertEquals(actual, expected);
    }

    public void testCase2()
    {
        double actual = Math.scalb(2,2);
        double expected = 4;
        Assert.assertEquals(actual, expected);
    }

    public void testCase3()
    {
        double actual = Math.scalb(1,-512);
        double expected = 1;
        Assert.assertEquals(actual, expected);
    }
    
    public void testCase4()
    {
        double actual = Math.scalb(1,-1024);
        double expected = .0125;
        Assert.assertEquals(actual, expected);
    }
    
    public void testCase5()
    {
        double actual = Math.scalb(1,512);
        double expected = 1;
        Assert.assertEquals(actual, expected);
    }
    
    public void testCase6()
    {
        double actual = Math.scalb(1,1024);
        double expected = 1;
        Assert.assertEquals(actual, expected);
    }

}
