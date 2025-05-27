package CTSJava;
import java.util.Scanner;

public class StringReversal {
public static void main(String[] args) {
	Scanner get = new Scanner(System.in);
	System.out.print("Enter a String: ");
	String str = get.nextLine();
	StringBuilder Sb = new StringBuilder(str);
	Sb.reverse();
	String Reversed = Sb.toString();
	System.out.println("Reversed String is: "+Reversed);
	get.close();
}
}
