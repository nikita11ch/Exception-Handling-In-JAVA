package Exception_Handling;

public class ClassNotFoundExpDemo 
{
	public ClassNotFoundExpDemo()
	{
		Class c; 
		try 
		{
			c = Class.forName("TestClass");
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace(); 
			System.out.println("Error : "+e.toString());
		}
	}

	
	public static void main(String[] args) 
	{
		new ClassNotFoundExpDemo();
	}

}
