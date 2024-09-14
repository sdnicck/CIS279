package pimaClass;

import java.util.Scanner;

class ClassSection {
	
		private int CRN;
		private int courseNum;
		private String departCode;
		private String instructMode;
		private String meetDays;
		private String meetTimes;
		private int classCap;
		private int classEnroll;
		private int idNum;
		
		Scanner courseSection = new Scanner(System.in);
		
		public void setCRN(int a) {
			this.CRN=a;
		}
		
		public int getCRN() {
			return CRN;
		}
		
		public void setCourseNum(int b) {
			this.courseNum=b;
		}
		
		public int getCourseNum() {
			return courseNum;
		}
		
		public void setDepartCode(String c) {
			this.departCode=c;
		}
			
		public String getDepartCode() {
			return departCode.toString();
		}
		
		public void setInstructMode(String d) {
			this.instructMode= d;
		}
		
		public String getInstructMode() {
			return instructMode.toString();
		}
		
		public void setMeetDays(String e) {
			this.meetDays= e;
		}
		
		public String getMeetDays() {
			return meetDays.toString();
		}
		
		public void setMeetTime(String f) {
			this.meetTimes = f;
		}
		
		public String getMeetTime() {
			return meetTimes.toString();
		}
		
		public void setClassCap(int g) {
			this.classCap = g;
		}
		
		public int getClassCap() {
			return classCap;
		}
		
		public void setClassEnroll(int h) {
			this.classEnroll = h;
		}
		
		public int getClassEnroll() {
			return classEnroll;
		}
		
		public void setIdNumber(int i) {
			this.idNum=i;
		}
		
		public int getIdNumber() {
			return idNum;
		}
		public String toString() {
			return getClass().getName(); 
		}
		
		/*System.out.println("CRN: "+CRN.toString());
		System.out.println("Instructional mode: "+instructMode.toString());
		System.out.println("Department: "+departCode.toString());
		System.out.println("Course number: "+courseNum.toString());
		System.out.println("Meeting days"+meetDays.toString());
		System.out.println("Meeting times: "+meetTime.toString());
		System.out.println("Capacity: "+classCapacity);
		System.out.println("Enrollment: "+classEnroll);
		System.out.println("Instructor’s ID: "+ idNumber);*/
		
	}
