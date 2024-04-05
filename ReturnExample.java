package Exception_Handling;

public class ReturnExample 
{
	public static void main(String[] args) 
    {     	
       System.out.println(methodReturningValue());        
    }	
	
	
	public static int methodReturningValue()
    {
        try
        {
            //System.out.println("Try block");
            System.out.println(10/0);
            return 10;    
        }
        catch (Exception e)
        {
            System.out.println("catch block");         
            return 20;  //return statement is compulsory  
        }
               
    }

}
