/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		int prev = -1;
		while (true) {
			int n = (int) (Math.random() * 10);
			if (n < prev) {
				break;
			}
			System.out.println(n);
			prev = n;
		}
		
	}
}
