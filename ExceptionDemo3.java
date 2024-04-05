package Exception_Handling;

public class ExceptionDemo3 
{
	public void checkException()
	{
	try
	{
	int num=Integer.parseInt("xyz");
	System.out.println(num);
	}
	catch (NumberFormatException e)
	{
	System.out.println("Number Format Exception Occured");
	}
	}

	public static void main(String[] args) 
	{
		ExceptionDemo3 e = new ExceptionDemo3();
		e.checkException();
	}

}
