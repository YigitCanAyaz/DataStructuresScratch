import java.util.Stack;

public class ReversingStringWithStack {

	public String revereString(String x) {

		if (x == null) {
			throw new IllegalArgumentException();
		}

		else {

			char[] newList = x.toCharArray();
			// a, b, c, d
			Stack<Character> stack = new Stack<>();

			for (char c : newList) {
				stack.push(c);
			}

			StringBuffer totalStr = new StringBuffer();

			while (!stack.isEmpty()) {
				totalStr.append(stack.pop());
			}

			return totalStr.toString();
		}

	}

}
