package hw2;
import java.util.Scanner;

public class MonthlyInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		// the user is prompted to enter the number of months they want to build up interest
		System.out.println("Enter the number of months:");
		int monthNum = scan.nextInt();
		
		//they are then prompted to enter a deposit value for each month
		System.out.println("Enter a deposit value:");
		double depositNum = scan.nextInt();
		
		//finally the user is prompted to enter a interest rate used to calculate interest earned over the course of the months entered
		System.out.println("Enter the annual percent interest:");
		double annualInterest = scan.nextInt();
		double monthlyInterest = (annualInterest/100)/12;
		
		//variables are initialized depending on their use
		double finalDeposit = 1;
		int monthOfInterest = 1;
		double sumOfDeposits =0;
		double endOfYear = 0;
		
		
		//creating a titles for columns in the table
		System.out.println("         "+ "\t\tDeposit" + "\t\tMonths of Interest Accrued\t" + "1+ Monthly Interest\t" + "(1+monthly interest rate) ^number of Months\t" + "Times Deposit\t");
		// starting the loop that starts from the first month to the final in-putted month of the user 
		for (int counter = 0; counter < monthNum; counter++) {
			//number of months used to measure interest growth
			monthOfInterest = monthNum-counter;
			// adding up each monthly deposit to generate a sum for the final month
			sumOfDeposits += depositNum;
			
			//using loop multiplication in place of exponents to determine the interest of that month based on previous interest gained
			// counter2 is used a loop for the exponent part of the equation and is initialized as monthNum at the beginning of each counter loop
			int counter2= monthNum;
			// the variable of total interest is re-initialized at the beginning of every counter loop
			double totalInterest = 1;
			// counter2 is set at the entered monthNum, however after each multiplication loop, counter2 decreases by 1 until counter and counter2 are equal
			//this way the amount of totalInterst displayed and used for the rest of the loop matches the months of interest accrued
			while (counter2 >counter) {
				counter2-= 1;
				totalInterest *= (1+monthlyInterest);
				}
			
			// the new interest is then multiplied by the deposit of that month
			//(Math.round(1000000*totalInterest))/1000000; is used to correct the values out-putted to match the worksheet
			finalDeposit = depositNum * (Math.round(1000000*totalInterest))/1000000;
			// each deposit from each month is added together to produce a final sum 
			endOfYear += finalDeposit;
			
			// all of the values displayed on the table are formatted to appropriate decimal points depending on the value and set as the returned variable for a string
			String returnedMonth = String.format( "Month %2d", counter+1);
			String returnedMonthofInterest = String.format("%2d", monthOfInterest);
			String returnedMonthlyInterest = String.format("%.4f", (1+monthlyInterest));
			String returnedTotalInterest = String.format("%.6f", totalInterest);
			String returnedFinalDeposit = String.format("%.4f", finalDeposit);
			String returnedDepositNum = String.format("%.2f", depositNum);

			//each value is then printed out each loop to form a column under each title 
			System.out.println(returnedMonth + "\t\t" + returnedDepositNum + "\t\t" +returnedMonthofInterest + "\t\t\t\t" + returnedMonthlyInterest + "\t\t\t" + returnedTotalInterest + "\t\t\t" +  "\t\t" + returnedFinalDeposit);
		}
		//at the end of the loop a sum of all deposits is shown along with a sum of deposits plus interest earned 
		String returnedSumOfDeposits = String.format("\nSum of Deposits: %2.2f", sumOfDeposits);
		System.out.println(returnedSumOfDeposits);
		
		String returnedEndOfYear = String.format("\nEnd-of-Year Total: %2.2f", endOfYear);
		System.out.println(returnedEndOfYear);
		
		scan.close();
	}
}


