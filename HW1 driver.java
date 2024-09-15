package pimaClass;

import java.util.Scanner;

public class SelectingClass {
	
	public static void main(String[] args) {
		
		Scanner courseSection = new Scanner(System.in);

		ClassSection newClass = new ClassSection();
		
		System.out.println("Please enter the CRN (eg '2008'): ");
		int CRN = courseSection.nextInt();
		newClass.setCRN(CRN);
		
		System.out.println("Please enter the department code (eg CIS): ");
		String departCode = courseSection.nextLine();
		newClass.setDepartCode(departCode);
		
		System.out.println("Please enter the course number (eg 279): ");
		int courseNum = courseSection.nextInt();
		newClass.setCourseNum(courseNum);
		
		System.out.println("Please enter the instructional mode ('online','in-person' or 'hybrid'): ");
		String instructMode = courseSection.nextLine();
		newClass.setInstructMode(instructMode);
		
		System.out.println("Please enter the meeting days (only if the class is in-person or hybrid, otherwise NA): ");
		String meetDays = courseSection.nextLine();
		newClass.setMeetDays(meetDays);
		
		System.out.println("Please enter the meeting times (only if the class is in-person or hybrid, otherwise NA): ");
		String meetTimes = courseSection.nextLine();
		newClass.setMeetTimes(meetTimes);

		System.out.println("Please enter the class capacity: ");
		int classCap = courseSection.nextInt();
		newClass.setClassCap(classCap);
		
		System.out.println("Please enter the current class enrollment: ");
		int classEnroll= courseSection.nextInt();
		newClass.setClassEnroll(classEnroll);

		System.out.println("Please enter the instructor's ID number: ");
		int idNum= courseSection.nextInt();
		newClass.setIdNum(idNum);
		
		System.out.println("CRN: "+ Integer.toString(newClass.getCRN())
		+"\nInstructional mode: "+instructMode.toString()
		+"\nCourse number: "+Integer.toString(courseNum)
		+"\nMeeting days"+meetDays.toString()
		+"\nMeeting times: "+ meetTimes.toString()
		+"\nCapacity: "+Integer.toString(classCap)
		+"\nEnrollment: "+Integer.toString(classEnroll)
		+"\nInstructor’s ID: "+ Integer.toString(idNum));
		
		courseSection.close();
		
	}
}
