
import java.util.Scanner;

public class WelcomeClass {

	public static void main(String[]args) {
		
		
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the value of first number");
		int number_1= ob.nextInt();
		System.out.println("Enter the value of second number");
		int number_2= ob.nextInt();
		int ans=number_1 + number_2;
		System.out.println( "Addition is " + ans);
	 
	}

}
