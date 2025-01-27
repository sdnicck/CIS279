/* Satya Dulam
** CIS 279, Assignment 6
** October 22, 2024
** CheckingAccount Class
**/

package homework6;

//creating subclass checking account from super class account 
public class CheckingAccount extends Account {

	//creating a constructor that takes no other parameters or variables outside of the ones given in the abstract class
	public CheckingAccount(int customerID, int accountNumber, char accountType, double interestRate, double balance,
			int term) {
		//accessing the parameters of super class
		super(customerID, accountNumber, accountType, interestRate, balance, term);
	}

	//overriding the abstract method from superclass Account to set own method
	//the new method also takes a new object from the transaction class as a parameter
	@Override
	public void processTransaction(Transaction transactionObject) {
		// the method adds creates an object in the transaction class and adds the object to the linked list in the super class
		transactionList.addLast(transactionObject);

		// if the transaction type of the checking account is check, the transaction amount is subtracted from the account balance
		if (transactionObject.getTransactionType() == 'C') {
			setBalance(getBalance() - transactionObject.getTransactionAmount());
		}
		// if the transaction type of the checking account is deposit, the transaction amount is added to the account balance
		if (transactionObject.getTransactionType() == 'D') {
			setBalance(getBalance() + transactionObject.getTransactionAmount());
		}

	}

}
