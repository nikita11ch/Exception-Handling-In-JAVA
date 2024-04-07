package BankAccountTransactions_Exception;

public class BankAccountScenario {

	public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            // Demonstrate performTransaction
            account.performTransaction(500); // Valid transaction
            //account.performTransaction(-200); // Invalid amount
            account.performTransaction(1500); // Insufficient funds
        } catch (InvalidTransactionException e) {
            System.out.println("Invalid transaction: " + e.getMessage());
        }

        try {
            // Demonstrate withdraw
            //account.withdraw(200); // Valid withdrawal
            //account.withdraw(-100); // Invalid amount
            //account.withdraw(1000); // Insufficient funds
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient funds: " + e.getMessage());
        }
    }

}
