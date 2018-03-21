import java.util.ArrayList;
import java.util.List;

/**
 * Homework2.
 * @author Tanasorn Tritawisup
 *
 */
public class recursion {

	/**
	 * Remove duplicate consecutive items from a list, changing the list
	 * parameter. For example, if list = { a, b, b, b, c, b, c, c} then after
	 * calling unique the list will contain {a, b, c, b, c}. Only consecutive
	 * duplicates are removed. Objects are compared using their own equals
	 * method.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates
	 *         removed.
	 */
	public static List unique(List list) {
		if(list.size() >= 2){
			if(list.get(0).equals(list.get(1))) {
				list.remove(0);
				unique(list.subList(0, list.size()));
			} unique(list.subList(1, list.size()));
		} return list;
	}
	
	/**
	 * This method help to find fibonacci.
	 * @param n 
	 * @param previous
	 * @param now 
	 * @return next fibonacci
	 */
	public static long nextFib(int n, int previous, int now){
		if(n == 0) return previous;
		return nextFib(n-1, now, previous + now);
	}
	
	
	/**
	 * Find the fibonacci number.
	 * @param n is number that you want to find fibonacci.
	 * @return fibonacci number.
	 */
	public static long fibonacci(int n) {
	    return nextFib(n, 0, 1);
	}
	
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		System.out.println(list.toString());
		System.out.println(unique(list).toString());
		System.out.print(fibonacci(30));
	}

}
