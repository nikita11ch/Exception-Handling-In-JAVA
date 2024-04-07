package BankAccountTransactions_Exception;


class InvalidTransactionException extends Exception
{
	public InvalidTransactionException(String message) 
	{
		super(message);
	}
	
}

class InsufficientFundsException extends RuntimeException
{
	public InsufficientFundsException(String n) 
	{
		super(n);
	}
}

public class BankAccount 
{
	private double balance;
	
	public BankAccount(double balance)
	{
		this.balance = balance;
	}
	
	public void performTransaction(double amount) throws InvalidTransactionException
	{
		if(amount<=0)
		{
			throw new InvalidTransactionException("Invalid amount");
		}
		if(balance<amount)
		{
            throw new InvalidTransactionException("Insufficient funds for transaction");
		}
		balance -= amount;
        System.out.println("Transaction of $" + amount + " completed successfully.");
  
	}
	
	public void withdraw(double amount)
	{
		if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount: " + amount);
        }

        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal");
        }
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + " completed successfully.");
  
	}
}
