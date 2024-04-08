package ShoppingCartItemAddition_Exception;

class InvalidItemException extends Exception
{
	public InvalidItemException(String message) {
		super(message);
	}	
}

class OutOfStockException extends RuntimeException
{
	public OutOfStockException(String message)
	{
		super(message);
	}	
}

public class ShoppingCart 
{
	private int availableItems;

	public ShoppingCart(int availableItems) 
	{
		super();
		this.availableItems = availableItems;
	}
	
	public void addItem(int quantity) throws InvalidItemException 
	{
		if(quantity<=0)
		{
			throw new InvalidItemException("Invalid Quantity");
		}
		if(quantity>availableItems)
		{
			throw new InvalidItemException("Insufficient stock");
		}
		System.out.println(quantity+" quantity added to cart using checked");
	}
	
	public void addItemUnchecked(int quantity)
	{
		if(quantity>availableItems)
		{
			throw new OutOfStockException("quantities exceeding the available stock");
		}
		if(quantity<=0)
		{
			throw new IllegalArgumentException("invalid quantity");
		}
		System.out.println(quantity+" quantity added to cart using unchecked");
	}
	
	

}












