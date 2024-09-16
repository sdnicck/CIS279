//Satya Dulam
//CIS 279: Homework 1 (SelectingClass driver)
//Sept 15, 2024

// both the class ClassSection and driver program Selecting Class are under package pimaClass
package pimaClass;

// scanner imported  for user input
import java.util.Scanner;

// start of driver program 
public class SelectingClass {
	
	public static void main(String[] args) {
		
		// scanner used to collect input from user
		Scanner courseSection = new Scanner(System.in);

		// new object 'newClass' created from class ClassSection 
		ClassSection newClass = new ClassSection();
		
		// prompting the user to enter a CRN and saving that under the appropriate parameter in the class 
		System.out.println("Please enter the CRN (eg '2008'): ");
		int CRN = courseSection.nextInt();
		newClass.setCRN(CRN);
		
		// prompting the user to enter a department code and saving that under the appropriate parameter in the class 
		System.out.println("Please enter the department code (eg CIS): ");
		courseSection.nextLine();
		String departCode = courseSection.nextLine();
		newClass.setDepartCode(departCode);
		
		// prompting the user to enter a course number and saving that under the appropriate parameter in the class 
		System.out.println("Please enter the course number (eg 279): ");
		int courseNum = courseSection.nextInt();
		newClass.setCourseNum(courseNum);
		
		// prompting the user to enter an instructional mode and saving that under the appropriate parameter in the class 
		System.out.println("Please enter the instructional mode ('online','in-person' or 'hybrid'): ");
		courseSection.nextLine();
		String instructMode = courseSection.nextLine();
		newClass.setInstructMode(instructMode);
		
		// prompting the user to enter meeting days and saving that under the appropriate parameter in the class 
		System.out.println("Please enter the meeting days (only if the class is in-person or hybrid, otherwise NA): ");
		String meetDays = courseSection.nextLine();
		newClass.setMeetDays(meetDays);
		
		// prompting the user to enter meeting times and saving that under the appropriate parameter in the class 
		System.out.println("Please enter the meeting times (only if the class is in-person or hybrid, otherwise NA): ");
		String meetTimes = courseSection.nextLine();
		newClass.setMeetTimes(meetTimes);

		// prompting the user to enter a class capacity and saving that under the appropriate parameter in the class 
		System.out.println("Please enter the class capacity: ");
		int classCap = courseSection.nextInt();
		newClass.setClassCap(classCap);
		
		// prompting the user to enter a class enrollment and saving that under the appropriate parameter in the class 
		System.out.println("Please enter the current class enrollment: ");
		int classEnroll= courseSection.nextInt();
		newClass.setClassEnroll(classEnroll);

		// prompting the user to enter an instructor ID number and saving that under the appropriate parameter in the class 
		System.out.println("Please enter the instructor's ID number: ");
		int idNum= courseSection.nextInt();
		newClass.setIdNum(idNum);
		
		// providing and output of all the entered information unless it doesn't meet the requirements of the class, eg online vs in-person and hybrid learning
		System.out.println(newClass.toString());
		
		//scanner closed 
		courseSection.close();
		
	}
}
