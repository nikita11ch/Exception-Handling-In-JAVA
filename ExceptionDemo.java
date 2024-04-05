package Exception_Handling;

public class ExceptionDemo
{
	public void checkException()
	{
		try 
		{
			int num1=30,num2=0;
			int operation=num1/num2;
			System.out.println("Result:"+operation);
		}
	catch(ArithmeticException e)
	{
		System.out.println("You Shouldn't divide a number by zero");
	} 
	}
	
	public static void main(String[] args) 
	{
		ExceptionDemo e = new ExceptionDemo();
		e.checkException();
	}

}
