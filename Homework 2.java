package hw2;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MonthlyInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat roundObj = new DecimalFormat ("###.0000");
		
		System.out.println("Enter the number of months:");
		int monthNum = scan.nextInt();
		
		System.out.println("Enter a deposit value:");
		double depositNum = scan.nextInt();
		
		System.out.println("Enter the annual interest in percent:");
		double annualInterest = scan.nextInt();
		double monthlyInterest = (annualInterest/100)/12;
		
		double totalInterest= 1;
		double finalDeposit = 1;
		//String titles = String.format
		System.out.println("Monthly Interest\t" + "Total Balance\t" +"Times Deposit\t");
		for (int counter = 0; counter < monthNum; counter++) {
			totalInterest *= (1+monthlyInterest);
			finalDeposit = depositNum * (Math.round(1000000*totalInterest))/1000000;
			//finalDeposit = (Math.floor(2000* finalDeposit))/2000;
			String returnedTotalInterest = String.format("%9.7f", totalInterest);
			String returnedFinalDeposit = String.format("%8.4f", finalDeposit);
			System.out.println( returnedTotalInterest + "\t\t" +  Math.round(1000000*totalInterest)+ "\t\t" + returnedFinalDeposit);
		}
		
		scan.close();
	}
}


