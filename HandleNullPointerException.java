package Exception_Handling;

public class HandleNullPointerException 
{
	public static void main(String[] args) 
	{
		HandleNullPointerException h=null;
		if (h==null)
		{
		h= new HandleNullPointerException();
		h.display();
		}
		else
		{
		h.display();
		}	
	}
	
	public void display()
	{
		System.out.println("printing args");
	}
}
