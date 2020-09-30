/*public class Recursion {
  
	public static int sum(int num) {
		if (num > 0) {
			return num + sum(num - 1);
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(sum(10));
	}
}
*/

public class Recursion {
	public static int sum(int num) {

		int VariableSum = 0;

		for (int i = num; i > 0; i--) {
			VariableSum += i;
		}
		return VariableSum;
	}

	public static void main(String[] args) {
		System.out.println(sum(10));
	}
}