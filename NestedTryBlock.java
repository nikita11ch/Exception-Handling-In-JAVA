package Exception_Handling;

public class NestedTryBlock 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/0);
			try
			{
				System.out.println(10/0);
			}
			catch(Exception e)
			{
				System.out.println("Inner try block exception");
			}
		}
		catch(Exception e)
		{
			System.out.println("Outer catch block exception");
		}
		
	}

}
