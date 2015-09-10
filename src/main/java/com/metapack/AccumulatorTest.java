package com.metapack;

import org.junit.Assert;
import org.junit.Test;


public class AccumulatorTest {
		
	@Test
    public void AccumulatorTest()   {
		
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