package CTSJava;

public class OperatorPrecedance {
public static void main(String[] args) {
	int result = (10+5)*2-6+8;
	System.out.println("Result of (10+5)*2-6+8: "+result);
	System.out.println("\nExplanation: The Order of Operation follows BODMAS Rule which means "
			+ "\nBracket(B) to be solved first followed by Exponents/Order(O), Multiplication(M), Addition(A) then Subtraction(S). "
			+ "\nBinary operators (like +, -, *, /) are left-associative While Assignment operators (=, +=, etc.), "
			+ "\nunary operators (++, --), and conditional operators are typically right-associative ");
	System.out.println("\nHere 10+5 = 15, then 15*2 = 30 then 30+8 = 38 and 38-6 = 32");
}
}
