package CTSJava;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
public static void main(String[] args) {
	Random random = new Random();
	Scanner get = new Scanner(System.in);
	int RandomNum = random.nextInt(100)+1;
	//int RandomNum = (int) (Math.random()*100)+1;
	System.out.print("Guess a Number between 1 to 100: ");
	int GuessedNum = get.nextInt();
	if(GuessedNum == RandomNum) {
		System.out.println("Yeah !! You got it!! The number is "+RandomNum);
	}
	else {
		System.out.println("Oops!! Try again..."+"\nThe number is "+RandomNum);
	}
	get.close();
}
}
