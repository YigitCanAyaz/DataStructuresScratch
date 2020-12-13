import java.util.Arrays;

public class PriorityQueueUsingArray {

	private int[] items = new int[5];
	private int count;

	public void add(int item) {
		if (count == items.length)
			throw new IllegalStateException();

		var i = shiftItemsToInstert(item);
		items[i] = item;
		count++;
	}

	private int shiftItemsToInstert(int item) {
		// Shifting items
		int i;
		for (i = count - 1; i >= 0; i--) {
			if (items[i] > item)
				items[i + 1] = items[i];
			else
				break;
		}

		return i + 1;
	}

	public int remove() {
		if (isEmpty())
			throw new IllegalStateException();

		return items[--count];
	}

	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public String toString() {
		return Arrays.toString(items);
	}

}
