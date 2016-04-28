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
        double actual = Math.scalb(1.0,-3);
        double expected = .125;
        Assert.assertEquals(actual, expected);
    }

    public void testCase2()
    {
        double actual = Math.scalb(2.0,2);
        double expected = 8;
        Assert.assertEquals(actual, expected);
    }

    public void testCase3()
    {
        double actual = Math.scalb(1.0,-512);
        double expected = 7.458340731200207E-155;
        Assert.assertEquals(actual, expected);
    }
    
    public void testCase4()
    {
        double actual = Math.scalb(1.0,-1024);
        double expected = 5.562684646268003E-309;
        Assert.assertEquals(actual, expected);
    }
    
    public void testCase5()
    {
        double actual = Math.scalb(1.0,512);
        double expected = 1.3407807929942597E154;
        Assert.assertEquals(actual, expected);
    }
    
    public void testCase6()
    {
        double actual = Math.scalb(1,1024);
        double expected = Double.POSITIVE_INFINITY;
        Assert.assertEquals(actual, expected);
    }

}
