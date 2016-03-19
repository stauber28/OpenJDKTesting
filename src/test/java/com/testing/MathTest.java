package com.testing;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Created by Garrett on 3/19/2016.
 */
public class MathTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MathTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MathTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testMath()
    {

    }
}
