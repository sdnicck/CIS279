//Satya Dulam
//CIS 789
//Homework 0

package parking;

// scanner imported for inputting data and Math for rounding

import java.util.Scanner;
import java.lang.Math;

//declaring and setting up class Parking Garage for determining how many hours people parked and the parking ticket price
public class ParkingGarage {
	//setting up the main function for the class
	public static void main(String[] args) {
		
		Scanner parkTicket = new Scanner(System.in);
		
		// Initializing variables 
		double totalTicketPrice = 0;
		double ticketPrice = 0;
		float totalTimeParked = 0;
		int totalTimeInterval = 0;
		
		// prompting the user to enter a day to determine the price rate of the ticket
		System.out.println("Please enter the first three letters of the day of the week: ");
		String dayOfWeek = parkTicket.nextLine();
		
		//depending on the day of the week, the rate per 15 minutes changes
		if (dayOfWeek.equalsIgnoreCase("mon") || dayOfWeek.equalsIgnoreCase("tue") || dayOfWeek.equalsIgnoreCase("wed")|| dayOfWeek.equalsIgnoreCase("thu")|| (dayOfWeek.equalsIgnoreCase("fri"))) {
			ticketPrice = 1.25;
		} if ((dayOfWeek.equalsIgnoreCase("sat") || (dayOfWeek.equalsIgnoreCase("sun")))) {
			ticketPrice = 0.5;
		}
		
		//prompting the user to enter in what time they arrived and what time they left 
		System.out.println("Please enter time parked (out of 2400): ");
		int timeEnter = parkTicket.nextInt();
		
		System.out.println("Please enter time left (out of 2400): ");
		int timeLeft = parkTicket.nextInt();
		// program will only continue if arrival time is before departure time
		if (timeLeft > timeEnter) {
		
			// converting the military time to minutes finding out how many minutes they were parked
			float timeEnterLeftover = timeEnter % 100;
			float timeEnterHour = timeEnter - timeEnterLeftover;
			float totalEnterTime = ((timeEnterHour/100) *60) + timeEnterLeftover;
		
			float timeLeftLeftover = timeLeft % 100;
			float timeLeftHour = timeLeft - timeLeftLeftover;
			float totalLeftTime = ((timeLeftHour/100) *60) + timeLeftLeftover;
			
			//finding out how many minutes they were parked
			totalTimeParked = (totalLeftTime - totalEnterTime)/15;// price is set at every 15 minute interval
			totalTimeInterval = Math.round(totalTimeParked); // intveral is rounded to match assignment
			
			//returning the day of week to the user
			System.out.println("Day of Week: "+ dayOfWeek);		
			
			// total parking ticket price is determined 
			totalTicketPrice = ticketPrice * totalTimeInterval; 
			
			// the amounts of minutes parked and total parking ticket is rounded to the correct decimal point
			String minuteParking = String.format("%.0f", totalLeftTime-totalEnterTime);
			
			String parkingPrice = String.format("%.2f", totalTicketPrice);
			
			// their parking information like how many minutes they parked and the parking rate is returned to the user
			System.out.println("Parking duration in minutes: "+minuteParking+ " rate: "+ticketPrice);
					
			//if the price of the parking ticket is below 15 it is returned to them otherwise they pay 15
			if (totalTicketPrice < 15) {
				System.out.println("Amount charged $" +  parkingPrice);
			} 
			if (totalTicketPrice >= 15) {
				System.out.println("Amount charged $" + 15);
			}
		} else {
			// program stops and needs to be restarted if arrival time is after departure time
			System.out.println("The times you have entered are invalid, please restart and enter times again.");
		}

	}	
}
