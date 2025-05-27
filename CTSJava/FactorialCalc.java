package CTSJava;
import java.util.Scanner;

public class FactorialCalc {
	
	public static int Fact(int num) {
		if(num==1) {
			return 1;
		}
		else {
		return num*(Fact(num-1));
	}
	}
	
	public static void main(String[] args) {
	Scanner get = new Scanner(System.in);
	System.out.println("Enter Number for Factorial: ");
	int FactNum = get.nextInt();
	int Result = Fact(FactNum);
	System.out.println("Factorial of "+FactNum+" is: "+Result);
	get.close();
	}
}
