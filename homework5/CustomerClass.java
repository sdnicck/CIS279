//Satya Dulam
//CIS279: Homework 5 (CustomerClass class)
//October 13, 2024 

//the main package where all the programs are 
package homework5;

//declaring class CustomerClass 
public class CustomerClass {

	//initializing all of the parameters for the class with their data type and as private 
	private int customerID;
	private String customerLastName;
	private String customerFirstName;
	private int creditScore;

	// creating a constructor for the class with all of the attributes 
	public CustomerClass(int customerID, String customerLastName, String customerFirstName, int creditScore) {
		this.customerID = customerID;
		this.customerLastName = customerLastName;
		this.customerFirstName = customerFirstName;
		this.creditScore = creditScore;
	}

	//creating getters and setters for attribute customerID
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getCustomerID() {
		return customerID;
	}

	//creating getters and setters for attribute customerLastName
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	//creating getters and setters for attribute customerFirstName
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}
	//creating getters and setters for attribute creditScore
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public int getCreditScore() {
		return creditScore;
	}
}
