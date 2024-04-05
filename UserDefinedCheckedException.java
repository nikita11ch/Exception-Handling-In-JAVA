package Exception_Handling;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception
{
	public InvalidAgeException()
	{		
	}
	
	public InvalidAgeException(String errorMessage)
	{
		super(errorMessage);
	}
}


public class UserDefinedCheckedException 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.print("Enter your Age :");
			int age = sc.nextInt();
			
			if(age < 18)
			{
			   throw new InvalidAgeException("Invalid Age");
			}
			else
			{
				System.out.println("You are eligible for Vote");
			}
		} 
		catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
	}
}
