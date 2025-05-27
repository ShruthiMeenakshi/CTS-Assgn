package CTSJava;
import java.util.Scanner;

public class MultTable {
public static void main(String[] args) {
	try(Scanner get = new Scanner(System.in)){
		System.out.println("Enter the number for Multiplication Table: ");
		int num = get.nextInt();
		if(num>0) {
			for(int i = 0;i<=10; i++) {
				int result = i*num;
				System.out.println(""+num+"*"+""+i+"="+""+result);
			}
		}
	}
}
}
