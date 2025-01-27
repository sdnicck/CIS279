//Satya Dulam
//CIS279: Homework 5 (driver program)
//October 13, 2024 


// the packages that contains all of the programs 
package homework5;

//importing systems to help run program 
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

//declaring main function for classes 
public class AdvancedArrays {
	public static void main(String[] args) throws Exception {

		try {
			// downloading the files with the information has an object
			File textFile = new File("C:\\Users\\sdotd\\Downloads\\HW5_Accounts.txt");
			// creating a scanner for the next file
			Scanner scan = new Scanner(textFile);
			// printing out a title for each column
			System.out.println(
					"Account Number\tCust ID\tLast Name\tFirst Name\tCredit Score\t Credit Limit\tEnding Balance\t"
							+ "Account Status\tPenalty Fee\tAverage Balance\t Interest Rate");
			//creating a loop that reads off all of the information from the text file and sets it as an attribute for the class
			//the limit is set at four because there are four customer names in the file 
			for (int i = 0; i < 4; i++) {
				// setting initial parameters for the new object created from class CreditCardAccount
				CreditCardAccount account = new CreditCardAccount(0, 0, 0, 0, 0, 0, "", "", 0);
				// converting the initial line of the file from a string into an integer 
				int accountNumber = Integer.parseInt(scan.nextLine());
				//setting the value being read as a parameter in the class 
				account.setAccountNumber(accountNumber);
				
				// converting the next line of the file from a string into an double 
				double startBalance = Double.parseDouble(scan.nextLine());
				//setting the value being read as a parameter in the class 
				account.setStartBalance(startBalance);
				
				// converting the next line of the file from a string into an double 
				double endBalance = Double.parseDouble(scan.nextLine());
				//setting the value being read as a parameter in the class 
				account.setEndBalance(endBalance);
				
				// converting the next line of the file from a string into an double 
				double creditLimit = Double.parseDouble(scan.nextLine());
				//setting the value being read as a parameter in the class 
				account.setCreditLimit(creditLimit);
				
				// converting the next line of the file from a string into an double 
				double interestRate = Double.parseDouble(scan.nextLine());
				//setting the value being read as a parameter in the class 
				account.setInterestRate(interestRate);
				
				// converting the next line of the file from a string into an integer 
				int customerID = Integer.parseInt(scan.nextLine());
				//setting the value being read as a parameter in the class 
				account.setNewCustomerCustomerID(customerID);

				//setting the values being read as a parameter in the class 
				account.setNewCustomerCustomerLastName(scan.nextLine());
				account.setNewCustomerCustomerFirstName(scan.nextLine());

				// converting the next line of the file from a string into an integer 
				int creditScore = Integer.parseInt(scan.nextLine());
				//setting the value being read as a parameter in the class 
				account.setNewCustomerCreditScore(creditScore);

				//displaying out all of the processed information collected from user by accessing the class the object is from 
				account.displayInfo();
				
			}

			//closing the scanner used to collect all of the information from 
			scan.close();

			//creating an exception in case the file is not read correctly 
		} catch (IOException e) {
			System.out.println("An error has occurred with the file");
			e.printStackTrace();

		}

	}

}
