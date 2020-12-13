import java.util.Arrays;

public class StaticArray {

	private int[] array;
	private int index = 0;

	public StaticArray(int size) {
		// TODO Auto-generated constructor stub
		array = new int[size];
	}

	public void insert(int data) {
		if (isFull()) {
			reSizeArray();
		}
		array[index++] = data;
	}

	public int removeAt(int givenIndex) {
		if (isEmpty())
			return -1;
		else if (givenIndex > index - 1)
			return -1;
		else {
			int temp = array[givenIndex];
			array[givenIndex] = 0;
			while (givenIndex + 1 < index) {
				array[givenIndex] = array[givenIndex + 1];
				array[givenIndex + 1] = 0;
				givenIndex++;
			}
			index--;
			return temp;
		}
	}

	public int indexOf(int data) {
		int i = 0;
		while (i < array.length) {
			if (array[i] == data) {
				return i;
			} else
				i++;
		}
		return -1;
	}

	public boolean isFull() {
		if (index == array.length)
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (index == 0)
			return true;
		else
			return false;
	}

	public void reSizeArray() {
		int[] demoArray = array;
		array = new int[array.length + 1];
		for (int i = 0; i < demoArray.length; i++) {
			array[i] = demoArray[i];
		}
	}

	public String toString() {
		return Arrays.toString(array);
	}
}