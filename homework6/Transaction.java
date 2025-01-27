package homework6;

/*
** Program	: Transaction.java
**
** Purpose	: To declare the properties and define the methods of the Transaction class which can represent 
**		  financial entities like loan payment, checks and deposits.
**
** F. D'Angelo
**
**Modified by Satya Dulam
** CIS 279, Assignment 6
** October 22, 2024
** Transaction Class
**/

//creating the class transaction 
public class Transaction {
	
	//initializing parameters for class 
	private int transactionID;
	private int transactionDate;
	private double amount;
	private char type;

	//creating default constructor for each object
	public Transaction() {
		setTransactionID(0);
		setTransactionDate(0);
		setTransactionAmount(0.0);
		setTransactionType(' ');
	}

	// creating a regular constructor 
	public Transaction(int transactionID, int transactionDate, double amount, char type) {
		setTransactionID(transactionID);
		setTransactionDate(transactionDate);
		setTransactionAmount(amount);
		setTransactionType(type);
	}

	// creating setters and getters for parameter transaction ID
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public int getTransactionID() {
		return transactionID;
	}

	// creating setters and getters for parameter transaction date
	public void setTransactionDate(int transactionDate) {
		this.transactionDate = transactionDate;
	}

	public int getTransactionDate() {
		return transactionDate;
	}

	// creating setters and getters for parameter transaction amount
	public void setTransactionAmount(double amount) {
		this.amount = amount;
	}

	public double getTransactionAmount() {
		return amount;
	}

	// creating setters and getters for parameter transaction type
	public void setTransactionType(char type) {
		this.type = type;
	}

	public char getTransactionType() {
		return type;
	}

	//creating a method to string to display out all of the data in the class 
	//overriding the main java method of .toString()
	@Override
	public String toString() {
		StringBuffer strBuf = new StringBuffer();

		//adding all of the data to a string
		strBuf.append("\nTransaction ID     : ");
		strBuf.append(transactionID);
		strBuf.append("\nTransaction Date   : ");
		strBuf.append(transactionDate);
		strBuf.append("\nTransaction amount : ");
		strBuf.append(amount);
		strBuf.append("\nTransaction type   : ");
		strBuf.append(type);
		strBuf.append("\n");

		//returning the string to a user
		return strBuf.toString();
	}
}
