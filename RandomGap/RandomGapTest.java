import java.util.*;
/*
Andrew Plaza
Who did you help?


How did you help them?


Who helped you?


How did they help you


*/

public class RandomGapTest {

	private Integer range;

	// private Integer[] Uniform;

	// Add attribute(s) to collect gap test data

	ArrayList<Integer> Gap;

	/*
	 * RandomGapTest Constructor
	 */
	public RandomGapTest(Integer range) {
		this.range = range;
		Gap = new ArrayList<Integer>();
		for (int i = 0; i < range; i++) {
			Gap.add(i, 0);
		}

	}

	public void RunTest(Integer Num) {

		ArrayList<Integer> testArray = new ArrayList<Integer>();

		Random rand = new Random();

		// create the test array for random numbers, make it the size of the
		// passed "Num"
		for (int i = 0; i < Num; i++) {
			testArray.add(rand.nextInt(range));
		}

		// iterate through the test Array
		for (int i = 0; i < testArray.size(); i++) {
			// make "j" which we will test each item from the testArray against
			for (int j = 0; j < range; j++) {
				// see if j is equal to the item in the test array
				if (j == testArray.get(i)) {
					// if it is, create k. K will find the next number in the
					// testArray which is the same as the number we have already
					// found
					int k = i + 1;

					while (testArray.get(j) != testArray.get(k)) {

							k++;
						}
					
					// if the difference between k and i (the size of the gap)
					// is larger than the range, increment 0 instead of printing
					// all the values out
					if ((k - i) > range - 1) {
						Gap.set(0, Gap.get(0) + 1);
						// in any other case the gap size will be well within
						// the rang so we can add it to the Gap array
					} else {
						Gap.set((k - i), Gap.get(k - i) + 1);
					}

				}

			}

		}

	}

	public ArrayList<Integer> GetGapData() {
		return this.Gap;
	}

}
