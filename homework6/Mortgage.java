/* Satya Dulam
** CIS 279, Assignment 6
** October 22, 2024
** Mortgage Class
**/

package homework6;

//creating the subclass from abstract class mortgage
public class Mortgage extends Account {

	//creating unique parameters and variables for the class not used outside the class so they are not included in the constructor 
	private double balanceRepaid;
	private double currentMonthInterest;
	private double monthlyInterestRate;
	private double periodicPayment;

	//creating a constructor for mortgage class
	public Mortgage(int customerID, int accountNumber, char accountType, double interestRate, double balance,
			int term) {
		//calling the super of the subclass to construct the superclass's parameters
		super(customerID, accountNumber, accountType, interestRate, balance, term);
	}

	//creating a setter and getter for currentMonthInterest
	public void setCurrentMonthInterest(double currentMonthInterest) {
		this.currentMonthInterest = currentMonthInterest;
	}

	public double getCurrentMonthInterest() {
		return currentMonthInterest;
	}

	//creating a setter and getter for balanceRepaid
	public void setBalanceRepaid(double balanceRepaid) {
		this.balanceRepaid = balanceRepaid;
	}

	public double getBalanceRepaid() {
		return balanceRepaid;
	}
	//creating a calculating function to solve for the periodic Payment value 
	public void calcPeriodicPayment() {
		monthlyInterestRate = interestRate / 12;
		double termInMonths = term * 12;
		double annuityFactor = ((1 - (1 / Math.pow((1 + monthlyInterestRate), termInMonths))) / monthlyInterestRate);
		periodicPayment = balance / annuityFactor;
	}

	//overriding the superclass's abstract method to create a new method 
	@Override
	public void processTransaction(Transaction transactionObject) {
		// the method adds creates an object in the transaction class and adds the object to the linked list in the super class
		transactionList.addLast(transactionObject);
		// if the parameter transaction type is equal to P, the method determines the month interest, the balance repaid and the new balance after interest 
		if (transactionObject.getTransactionType() == 'P') {

			setCurrentMonthInterest(getBalance() * monthlyInterestRate);
			setBalanceRepaid(periodicPayment - getCurrentMonthInterest());
			setBalance(getBalance() - getBalanceRepaid());
		}

	}

}
