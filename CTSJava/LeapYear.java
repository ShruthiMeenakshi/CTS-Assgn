package CTSJava;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		try(Scanner get = new Scanner(System.in)){
			System.out.print("Enter a Year: ");
			int year = get.nextInt();
			if(year % 4 ==0) {
				if(year % 100 != 0) {
				if(year % 400 ==0) {
					System.out.print("yes, the Year "+year+" is a Leap Year");
				}
				else {
					System.out.print("yes, the Year "+year+" is a Leap Year");
				}
			}
				else {
					System.out.print("yes, the Year "+year+" is a Leap Year");
				}
			}
			else {
				System.out.print("No, the Year "+year+" is not a Leap Year");
		}
		}
	}
}
