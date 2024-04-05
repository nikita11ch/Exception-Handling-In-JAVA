package Exception_Handling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a & b : ");
		
		try 
		{
			//int a=sc.nextInt();
			//int b=sc.nextInt();
		}
		catch(InputMismatchException  e)
		{
			System.out.println("Error occured: "+e.getMessage());
			System.out.println("Using printStackTrace()");
			e.printStackTrace();
			System.out.println();
			System.out.println("Using toString()");
			System.out.println(e.toString());
		}
	sc.close();	
	}

}

