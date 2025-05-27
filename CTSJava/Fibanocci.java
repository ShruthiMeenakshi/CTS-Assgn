package CTSJava;

public class Fibanocci {

	public static int Fib(int n) {
		if(n<0) {
			throw new IllegalArgumentException("Fibanocci Series cannot be negative");
		}
		else if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		else {
			return Fib(n-1) + Fib(n-2);
		}
	}
	public static void main(String[] args) {
        System.out.println("Fibonacci Sequence of first 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print(Fib(i) + " ");
        }
	}
}
