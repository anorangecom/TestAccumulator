/**
 * 
 */
package com.metapack;

/**
 * @author Alexey Moroz
 *
 */
public class AccumulatorImpl implements Accumulator {

	private static int accumulatedValue = 0;
		
	public int accumulate(int... values) {
		for (int i=0; i<values.length; i++) {
			accumulatedValue = accumulatedValue + values[i];
			}
		return accumulatedValue;
	}

	/* (non-Javadoc)
	 * @see metapack.Accumulator#getTotal()
	 */
	public int getTotal() {		
		return accumulatedValue;
		}

	/* (non-Javadoc)
	 * @see metapack.Accumulator#reset()
	 */
	public void reset() {
		accumulatedValue = 0;		
		}

		
	public static void main(String[] args) {		
		Accumulator accumulator = new AccumulatorImpl();
		int firstSum = accumulator.accumulate(1, 2, 3);
		int secondSum = accumulator.accumulate(4);
		int total = accumulator.getTotal();
		System.out.println("Accumulator total -> " + total);
	}
	
}