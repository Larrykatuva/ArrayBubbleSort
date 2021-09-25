
public class BubbleArray {
	private int[] arr;
	private int nItems;
	
	/**
	 * Class constructor
	 * @param size
	 */
	public BubbleArray(int size) {
		this.arr = new int[size];
		this.nItems = 0;
	}
	
	
	/**
	 * Inserting value into the array
	 * @param value
	 */
	public void insertValue(int value) {
		this.arr[this.nItems] = value;
		this.nItems ++;
	}
	
	
	/**
	 * Displaying all the value in the array
	 */
	public void displayValues() {
		for(int value: arr) {
			System.out.println(value);
		}
	}
	
	
	/**
	 * Sorting array values using bubble sort algorithm
	 */
	public void sortValues() {
		int outerValue, innerValue;
		for(outerValue = this.nItems - 1; outerValue > 1; outerValue --) {
			for(innerValue = 0; innerValue < outerValue; innerValue ++) {
				if(this.arr[innerValue] > this.arr[innerValue + 1]) {
					swapValues(innerValue, innerValue + 1);
				}
			}
		}
	}
	
	
	/**
	 * Swapping two values
	 * @param innerValue
	 * @param outerValue
	 */
	public void swapValues(int innerValue, int outerValue) {
		int temp = this.arr[innerValue];
		this.arr[innerValue] = this.arr[outerValue];
		this.arr[outerValue] = temp;
	}

}
