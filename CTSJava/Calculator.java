package CTSJava;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		try(Scanner get=new Scanner(System.in)){
			int Op;
			do {
			System.out.println("Enter first number");
			int num1 = get.nextInt();
			System.out.println("Enter second number");
			int num2 = get.nextInt();
			System.out.println("Choose your Operation:");
			System.out.println("1. Addition  2. Subtraction 3. Multiplication 4. Division 5.Exit");
			Op=get.nextInt();
			int result;
			switch(Op) {
			case 1:
				result = num1+num2;
				System.out.println(""+result);
				break;
			case 2:
				result = num1-num2;
				System.out.println(""+result);
				break;
			case 3:
				result = num1*num2;
				System.out.println(""+result);
				break;
			case 4:
				result = num1/num2;
				System.out.println(""+result);
				break;
			case 5:
				System.out.println("Exiting");
				break;
			default :
				System.out.println("Enter valid number");
			}
			}
			while(Op!=5);
			
		}
		
	}
}
