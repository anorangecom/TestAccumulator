package com.metapack;

import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Test
     */    
    public void testApp() {
        //assertTrue( true );
    	
    	Accumulator accumulator = new AccumulatorImpl();
		
		int firstSum = accumulator.accumulate(1, 2, 3);
		Assert.assertEquals(firstSum, 6);
				
		int secondSum = accumulator.accumulate(4);
		Assert.assertEquals(secondSum, 10);
						
		int total = accumulator.getTotal();
		Assert.assertEquals(total, 10);
		
		accumulator.reset();
		total = accumulator.getTotal();
		Assert.assertEquals(total, 0);
    	
    	
    }
}
