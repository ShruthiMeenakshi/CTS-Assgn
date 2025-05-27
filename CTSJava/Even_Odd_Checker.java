package CTSJava;

import java.util.Scanner;

public class Even_Odd_Checker {
	public boolean check(int a) {
		return a%2==0;
	}
	public String valuecheck(int b) {
		if(b%2==0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
	public static void main(String[] args) {
		Even_Odd_Checker numchecks = new  Even_Odd_Checker();
		boolean result = numchecks.check(5);
		String ans = numchecks.valuecheck(5);
		System.out.println("Is num 5 even: "+result+", it is "+ans);
		
		try(Scanner get=new Scanner(System.in)){
			System.out.println("write your number to check it is even or odd:");
			int num=get.nextInt();
			boolean numbool=numchecks.check(num);
			String numans=numchecks.valuecheck(num);
			System.out.println(""+numbool+", it is "+numans);
		}
		}
	}