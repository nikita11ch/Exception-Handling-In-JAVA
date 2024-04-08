package ShoppingCartItemAddition_Exception;

public class ShoppingCartScenario 
{
	public static void main(String[] args) 
	{
		ShoppingCart Shop = new ShoppingCart(50);
		try
		{
			Shop.addItem(-60);
		}
		catch(InvalidItemException i)
		{
			System.out.println("Invalid item : "+ i.getMessage());
		}
		
		try
		{
			Shop.addItemUnchecked(40);
		}
		catch(OutOfStockException o)
		{
			System.out.println("Unchecked message: "+ o.getMessage());
		}
	}

}
