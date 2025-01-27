/* Satya Dulam
** CIS 279, Assignment 6
** October 22, 2024
** Account Class
**/

package homework6;

//important programs to help run code
import java.util.LinkedList;

//creating abstract class Account to create concrete classes
public abstract class Account {

	//creating new linked list under class transaction to track processing transactions 
	LinkedList<Transaction> transactionList = new LinkedList<Transaction>();

	//initializing variables under protected so subclasses are able to construct with them
	protected int customerID;
	protected int accountNumber;
	protected char accountType;
	protected double interestRate;
	protected double balance;
	protected int term;

	// creating a constructor for abstract that with attributes that all of the base classes will have 
	public Account(int customerID, int accountNumber, char accountType, double interestRate, double balance, int term) {
		this.customerID = customerID;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.interestRate = interestRate;
		this.balance = balance;
		this.term = term;
	}

	// creating a setter and getter for parameter customer ID 
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getCustomerID() {
		return customerID;
	}

	// creating a setter and getter for parameter account number
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	// creating a setter and getter for parameter account type
	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}

	public char getAccountType() {
		return accountType;
	}

	// creating a setter and getter for parameter interest rate
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	// creating a setter and getter for parameter balance
	public void setBalance(double balance) {
		this.balance = round(balance, 2);
	}

	public double getBalance() {
		return balance;
	}

	// creating a setter and getter for parameter term
	public void setTerm(int term) {
		this.term = term;
	}

	public int getTerm() {
		return term;

	}

	//creating an abstract method for each subclass to override with their own methods 
	public abstract void processTransaction(Transaction transactionObject);

	// creating a method to display all of the transactions of a certain account regardless of the account 
	public String listTransactions() {
		//creating a new string to add to while looping
		StringBuffer strBuf = new StringBuffer();

		//looping through each transaction of a specific object and calling the toString method in the transaction class 
		for (Transaction transactionObj : transactionList) {

			strBuf.append(transactionObj.toString());
			strBuf.append("\n");

		}
		//returning the string of all respective account transactions 
		return strBuf.toString();

	}

	//creating a new toString() method that displays out all of the customer's account information 
	@Override
	public String toString() {
		//creating a new string to add all the information 
		StringBuffer strBuf = new StringBuffer();

		//adding the information to the string
		strBuf.append("\nCustomer ID: ");
		strBuf.append(customerID);
		strBuf.append("\nAccount Number: ");
		strBuf.append(accountNumber);
		strBuf.append("\nInterest Rate : ");
		strBuf.append(interestRate);
		strBuf.append("\nBalance   : ");
		strBuf.append(balance);
		strBuf.append("\nTerm   : ");
		strBuf.append(term);
		strBuf.append("\n");

		//returning the string to user
		return strBuf.toString();
	}

	// making sure the display of any amount of balance is rounded to two decimal places 
	//method provided in the assignment 
	public static double round(double valueToRound, int numberOfDecimalPlaces) {
		valueToRound *= Math.pow(10, numberOfDecimalPlaces);

		int roundedValueInt = (int) valueToRound;

		double roundedValueDbl = (double) roundedValueInt / Math.pow(10, numberOfDecimalPlaces);

		return roundedValueDbl;
	}
}
