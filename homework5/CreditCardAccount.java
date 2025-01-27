//Satya Dulam
//CIS279: Homework 5 (CreditCardAccount class)
//October 13, 2024 

package homework5;

//declaring class CreditCardAccount
public class CreditCardAccount {

	//declaring parameters from class under private with data types
	private int accountNumber;
	private double startBalance;
	private double endBalance;
	private double creditLimit;
	private double interestRate;
	//parameter newCustomer is an object from the class CustomerClass 
	private CustomerClass newCustomer;

	// a new constructor is created from the class using each attribute 
	// the object newCustomer has it's own parameters associated with it so those are also included 
	public CreditCardAccount(int accountNumber, double startBalance, double endBalance, double creditLimit,
			double interestRate, int newCustomerCustomerID, String newCustomerCustomerLastName,
			String newCustomerCustomerFirstName, int newCustomerCreditScore) {
		//each parameter is set with it's variable 
		this.accountNumber = accountNumber;
		this.startBalance = startBalance;
		this.endBalance = endBalance;
		this.creditLimit = creditLimit;
		this.interestRate = interestRate;
		// the object is constructed with it's own parameters that have their own getters and setters 
		this.newCustomer = new CustomerClass(newCustomerCustomerID, newCustomerCustomerLastName,
				newCustomerCustomerFirstName, newCustomerCreditScore);
	}

	// a getter and setter is created for parameter accountNumber
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	// getter and setter is created for parameter startBalance
	public void setStartBalance(double startBalance) {
		this.startBalance = startBalance;
	}

	public double getStartBalance() {
		return startBalance;
	}
	
	// getter and setter is created for parameter endBalance
	public void setEndBalance(double endBalance) {
		this.endBalance = endBalance;
	}

	public double getEndBalance() {
		return endBalance;
	}
	
	// getter and setter is created for parameter creditLimit
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	// getter and setter is created for parameter interestRate
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}
	// getter and setter is created for parameter customerID within the object newCustomer 
	public void setNewCustomerCustomerID(int newCustomerCustomerID) {
		this.newCustomer.setCustomerID(newCustomerCustomerID);
	}

	public int getNewCustomerCustomerID() {
		return newCustomer.getCustomerID();
	}
	// getter and setter is created for parameter customerLastName within the object newCustomer 
	public void setNewCustomerCustomerLastName(String newCustomerCustomerLastName) {
		this.newCustomer.setCustomerLastName(newCustomerCustomerLastName);
	}

	public String getNewCustomerCustomerLastName() {
		return newCustomer.getCustomerLastName();
	}
	// getter and setter is created for parameter customerFirstName within the object newCustomer 
	public void setNewCustomerCustomerFirstName(String newCustomerCustomerFirstName) {
		this.newCustomer.setCustomerFirstName(newCustomerCustomerFirstName);
	}

	public String getNewCustomerCustomerFirstName() {
		return newCustomer.getCustomerFirstName();
	}

	// getter and setter is created for parameter creditScore within the object newCustomer 
	public void setNewCustomerCreditScore(int newCustomerCreditScore) {
		this.newCustomer.setCreditScore(newCustomerCreditScore);
	}

	public int getNewCustomerCreditScore() {
		return newCustomer.getCreditScore();
	}

	//a displaying function with in the class is declared 
	public void displayInfo() {
		// the temporary variable of accountStatus is set to 'OK' unless the credit limit is less than the ending balance 
		String accountStatus = "OK";
		// the temporary variable of penaltyFee is set to 0 unless the credit limit is less than the ending balance
		String penaltyFee = String.format("%6.2f", 0.0);
		// if the creditLimit is greater than the ending balance, the customer is designated as over and they are charged a penalty fee of 5 percent of their ending balance
		if (getCreditLimit() < getEndBalance()) {
			accountStatus = "OVER";
			penaltyFee = String.format("%6.2f", 0.05 * getEndBalance());
		}

		// each of the values requiring string type formating are created into strings 
		String creditLimitStg = String.format("%9.2f", getCreditLimit());
		String interestRateStg = String.format("%.0f", 100 * getInterestRate());
		String endBalanceStg = String.format("%.2f", getEndBalance());
		String averageStg = String.format("%.2f", (getEndBalance() + getStartBalance()) / 2);

		// the function will display each of the values to be formatted under their respective columns like in the example 
		System.out.printf(getAccountNumber() + " \t" + getNewCustomerCustomerID() + "\t"
				+ getNewCustomerCustomerLastName() + "\t\t" + getNewCustomerCustomerFirstName() + "\t\t"
				+ getNewCustomerCreditScore() + "\t\t" + creditLimitStg + "\t" + endBalanceStg + "\t\t" + accountStatus
				+ " \t\t" + penaltyFee + " \t\t" + averageStg + "\t\t " + interestRateStg + "%% \n");
	}
}
