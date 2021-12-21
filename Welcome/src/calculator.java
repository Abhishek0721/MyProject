import java.util.Scanner;

public class calculator {
	
	
		
	void addition()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of number1");
		int i=scan.nextInt();
		System.out.println("Enter the value of number2");
		int j=scan.nextInt();
		System.out.println("addition is" + (i+j));	
	}
	void multiplication()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of number1");
		int i=scan.nextInt();
		System.out.println("Enter the value of number2");
		int j=scan.nextInt();
		System.out.println("multiplication is" + (i*j));
		
	}
	void Substraction()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of number1");
		int i=scan.nextInt();
		System.out.println("Enter the value of number2");
		int j=scan.nextInt();
		System.out.println("substraction  is" + (i+j));	
	}
	
	public static void main(String[]args) 
	{
		calculator test=new calculator();
	    System.out.println("1.add");
	    System.out.println("2.mul");
	    System.out.println("3.sub");
	    Scanner scan=new Scanner(System.in);
	    int choice =scan.nextInt();
	    
	    switch(choice)
	    {
	    case 1:
	    	test.addition();
	    	break;
	    case 2:
	    	test.multiplication();
	    case 3:
	    	test.Substraction();
	    	break;
	    	default:
	    		System.out.println("Invalid choice");
	    }
	    
	    
	    
	}
}


