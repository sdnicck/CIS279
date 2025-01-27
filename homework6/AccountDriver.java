package homework6;

/*
** Program	: MainDriver.java
**
** Purpose	: To declare and instantiate objects of various derived clases of a common base class. 
**
**			In this example, the derived classes -- CheckingAccount and Mortgagge -- inherit 
**			the attributes and methods of the abstract base Account class, 
**			then add their own specialized attributes and methods for handling situations specific
**			them. They also have their own overridden versions of the process Transaction and 
**			toString methods. 
**
**			Note that we've declared the base class, Account, as abstract because it makes no sense
**			to create an object of this class since it is too general or abstract when we actually
**			deal with more specific entities like checking accounts and mortgages.
**
**
**
** Developer	: F. D'Angelo
** Modified by Satya Dulam
** CIS 279, Assignment 6
** October 22, 2024
** AccountDriver
**/

//importing files to help run program
import java.util.LinkedList;

//initializing main driver class 
public class AccountDriver {
	// beginning main program 
	public static void main(String[] args) {

		// Here we declare and instantiate an empty LinkedList of the base class.
		LinkedList<Account> accountList = new LinkedList<Account>();

		//creating two objects for each class  (checking account and mortgage) with their respective attributes 
		// Mortgage = new Mortgage( customerID, accountNumber, accountType, interestRate, balance, term);
		Mortgage mortgage1 = new Mortgage(1000, 10000, 'M', 0.06875, 95000, 15);
		Mortgage mortgage2 = new Mortgage(2000, 20000, 'M', 0.08905, 11000, 12);
		//adding the objects to the list accountList
		accountList.addLast(mortgage1);
		accountList.addLast(mortgage2);

		//creating two objects for each class  (checking account and mortgage) with their respective attributes 
		CheckingAccount checkingAcount1 = new CheckingAccount(2000, 20000, 'M', 0.08905, 5000, 12);
		CheckingAccount checkingAcount2 = new CheckingAccount(1000, 10000, 'M', 0.06875, 2000, 15);
		//adding the objects to the list accountList
		accountList.addLast(checkingAcount1);
		accountList.addLast(checkingAcount2);

		//looping through all of the accounts in the list accountList
		for (Account accountObj : accountList) {
			//printing out the different accounts from the base class
			System.out.println(accountObj.toString() + "\n");
			
			//clearing the transactionList objects so each loop doesn't repeat each unique processTransaction to the list in accounts
			accountObj.transactionList.clear();
			
			//providing the process transactions for each object
			// Transaction(int transactionID, int transactionDate, double amount , char type)
			//'P'=Payment
			//'C'=Check
			//'D'=Deposit

			mortgage1.processTransaction(new Transaction(5001, 20150515, 847.26, 'P'));

			mortgage1.processTransaction(new Transaction(5002, 20150615, 857.26, 'P'));

			mortgage1.processTransaction(new Transaction(5003, 20150715, 867.26, 'P'));

			mortgage1.processTransaction(new Transaction(5004, 20150815, 887.26, 'P'));

			mortgage2.processTransaction(new Transaction(5005, 20150915, 234.26, 'P'));

			mortgage2.processTransaction(new Transaction(5001, 20150515, 300.26, 'P'));

			mortgage2.processTransaction(new Transaction(5002, 20150615, 234.26, 'P'));

			mortgage2.processTransaction(new Transaction(5003, 20150715, 823.26, 'P'));
			
			checkingAcount1.processTransaction(new Transaction(5001, 20150515, 847.26, 'C'));

			checkingAcount1.processTransaction(new Transaction(5002, 20150615, 857.26, 'C'));

			checkingAcount1.processTransaction(new Transaction(5003, 20150715, 867.26, 'D'));

			checkingAcount1.processTransaction(new Transaction(5004, 20150815, 887.26, 'C'));

			checkingAcount2.processTransaction(new Transaction(5005, 20150915, 234.26, 'D'));

			checkingAcount2.processTransaction(new Transaction(5001, 20150515, 300.26, 'D'));

			checkingAcount2.processTransaction(new Transaction(5002, 20150615, 234.26, 'C'));

			checkingAcount2.processTransaction(new Transaction(5003, 20150715, 823.26, 'D'));

			//printing out each transaction for the account
			System.out.println(accountObj.listTransactions());

			//displaying the current balance of the account after processing transactions 
			System.out.println("\nThe current account balance is " + accountObj.getBalance() + ".\n\n");
		}

	}

}
