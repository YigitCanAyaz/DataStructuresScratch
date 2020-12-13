import java.util.Arrays;

public class StackUsingArray {

	private int size = 5;
	private int[] stack = new int[size];
	private int count = 0;

	public void push(int x) {
		if (count < stack.length) {
			stack[count] = x;
			count++;
		} else {
			int[] newStack = stack;
			size += 5;
			stack = new int[size];
			for (int i = 0; i < newStack.length; i++) {
				stack[i] = newStack[i];
			}
			stack[count] = x;
			count++;
		}
	}

	public int pop() {
		if (isEmpty())
			return -1;
		else {
			int[] newStack = stack;
			size--;
			stack = new int[size];
			for (int i = 0; i < size; i++) {
				stack[i] = newStack[i];
			}
			count--;
			return newStack[count];
		}
	}

	public int peek() {
		if (isEmpty())
			return -1;
		else {
			return stack[count - 1];
		}
	}

	public boolean isEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}

	public String toString() {
		return Arrays.toString(stack);
	}

}
