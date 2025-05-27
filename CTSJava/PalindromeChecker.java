package CTSJava;
import java.util.Scanner;

public class PalindromeChecker {
	public boolean palindrome(String str) {
		if (str == null || str.isEmpty()) {
            return true;
        }
		 String CrctStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");
		 int left = 0;
		 int right = CrctStr.length() - 1;
		 
		 while(left < right) {
			 if(CrctStr.charAt(left) != CrctStr.charAt(right)) {
				 return false;
			 }
			 left++;
			 right--;
		 }
		 return true;
	}
	
	
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = get.nextLine();
		PalindromeChecker func = new PalindromeChecker();
		boolean Result = func.palindrome(string);
		System.out.println(""+Result);
		get.close();
	}
}
