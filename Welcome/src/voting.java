import java.util.Scanner;
public class voting {

		public static void main(String[]args) {
			
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1.addition");
		System.out.println("2.multiplication");
		System.out.println("3.substraction");
		System.out.println("4.division");
		int choice = scan.nextInt();
		
			System.out.println("what do you want today");
		
while(true) {
				System.out.println("Enter the number 1");
				int number_1=scan.nextInt();
				System.out.println("Enter the number 2");
				int number_2=scan.nextInt();
				
				if(choice==1) {
					System.out.println("addition is"+ (number_1+ number_2));
				
			}
				else if(choice==2) {
					System.out.println("multiplication is"+ (number_1*number_2));
				}
		}
		}
}
		




