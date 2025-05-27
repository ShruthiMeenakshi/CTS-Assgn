package CTSJava;
import java.util.Scanner;

public class arraySum {
public static void main(String[] args) {
	Scanner get = new Scanner(System.in);
	System.out.print("Number of array elements:");
	int n = get.nextInt();
	int[] nums = new int[n];
	for(int i=0;i<n;i++) {
		nums[i]=get.nextInt();
	}
	int sum = 0;
	for(int i = 0;i < n;i++) {
		sum = sum+nums[i];
	}
	int Avg = sum/n;
	System.out.print("Your Sum of the array: "+sum);
	System.out.print("\nYour Average is: "+Avg);
	get.close();
}
}
