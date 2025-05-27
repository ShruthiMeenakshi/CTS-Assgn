package CTSJava;
import java.util.Scanner;

public class TypeCasting {
public static void main(String[] args) {
	try(Scanner get = new Scanner(System.in)){
		double doubleNum = 10.51;
		int Integer = (int) doubleNum;
		System.out.println("Double to Integer: "+Integer);
		int IntValue = 25;
		double DoubleVal = IntValue;
		System.out.print("Integer to Double: "+DoubleVal);
	}
}
}
