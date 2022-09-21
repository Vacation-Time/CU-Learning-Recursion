
public class RecursionExample1 {

	public static void main(String[] args) {
		System.out.println("Sum of 1 through 20: " + sum(20));
		System.out.println("Sum of 1 to 1: " + sum(1));
		
		System.out.println("Factorial(10): " + factorial(10)); //3628800
		
		System.out.println("Fib(10): " + fib(10)); // 75

	}

	public static int sum(int n) {
		// Base Case
		if (n < 2)
			return n;
		// Recursive step
		return n + sum(n-1);
	}
	
	public static int factorial(int n) {
		// base case
		if (n == 1)
			return n;
		else
			// recursive step
			return n * factorial(n-1);
	}
	
	public static int fib(int n) {
		// base case
		if (n == 0)
			return n;
		else
			return n + fib(n-1);
	}
	
	public static boolean isPowerOf2(int n) {
		// return true for 1, 2, 3, 4, 8...
		// return false otherwise
		
	
	}
}
