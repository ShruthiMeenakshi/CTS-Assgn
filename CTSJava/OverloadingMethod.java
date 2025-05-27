package CTSJava;
import java.util.Scanner;

public class OverloadingMethod {
public static double add(double a,double b ) {
		return a+b;
	}
public static int add(int a,int b) {
	return a+b;
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		int choice;
		do {
			System.out.print("Choose what summation you want\n"
					+ "\n 1. Adding 2 decimals 2. Adding 2 numbers. 3. Adding 3 numbers 4.Exit\n");
			System.out.print("\nEnter here: ");
			choice = get.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter a number: ");
				double d1 = get.nextDouble();
				System.out.print("Enter a number: ");
				double d2 = get.nextDouble();
				System.out.println("Your Sum"+add(d1,d2));
				break;
			case 2:
				System.out.print("Enter a number: ");
				int int1 = get.nextInt();
				System.out.print("Enter a number: ");
				int int2 = get.nextInt();
				System.out.println("Your Sum"+add(int1,int2));
				break;
			case 3:
				System.out.print("Enter a number: ");
				int in1 = get.nextInt();
				System.out.print("Enter a number: ");
				int in2 = get.nextInt();
				System.out.print("Enter a number: ");
				int in3 = get.nextInt();
				System.out.println("Your Sum is: "+add(in1,in2,in3));
				break;
			case 4:
				System.out.print("Closing... ");
				break;
			}
		}
		while(choice !=4);
		get.close();
	}

}
