package Exception_Handling;

import java.util.Scanner;

class GreaterMarksException extends RuntimeException
{
	public GreaterMarksException()
	{	
	}
	public GreaterMarksException(String s)
	{
		super("kk");
	}
}
public class UserdefinedUnchecked 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		try(sc)
		{
			System.out.print("Enter the marks :");
			
			int marks = sc.nextInt();
			
			if(marks > 100)
			{
				throw new GreaterMarksException("Invalid Marks");
			}
			else
			{
				System.out.println("Your Marks is :"+ marks);
			}
		}
		catch(GreaterMarksException e)
		{
			System.err.println(e);
		}
        System.out.println("Main completed");
	}

}
