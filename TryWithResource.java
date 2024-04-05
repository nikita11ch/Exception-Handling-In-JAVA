package Exception_Handling;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TryWithResource 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc)
		{
			System.out.println("Enter your Employee Id :");
			int id = sc.nextInt();
			System.out.println("Your Id is :"+id);
		}
		catch(InputMismatchException e)
		{
			System.err.println("Input is Invalid");
		}
		
		
	}

}
