//Satya Dulam
//CIS 279: Homework 1 (ClassSection class)
//Sept 15, 2024

// both the class ClassSection and driver program Selecting Class are under package pimaClass
package pimaClass;

// class is defined  
class ClassSection {
	
		// intalizing parameters under private with approraite  int or string data types 
		private int CRN;
		private int courseNum;
		private String departCode;
		private String instructMode;
		private String meetDays;
		private String meetTimes;
		private int classCap;
		private int classEnroll;
		private int idNum;
		
		// creating a setter and getter for variable CRN
		public void setCRN(int a) {
			this.CRN=a;
		}
		
		public int getCRN() {
			return CRN;
		}
		
		// creating a setter and getter for variable courseNum
		public void setCourseNum(int b) {
			this.courseNum=b;
		}
		
		public int getCourseNum() {
			return courseNum;
		}
		
		//creating a setter and getter for variable departCode
		public void setDepartCode(String c) {
			this.departCode=c;
		}
			
		public String getDepartCode() {
			return departCode.toString();
		}
		
		//creating a setter and getter for variable instructMode
		// the setter only allows the user to enter in(-)person, online or hybrid
		public void setInstructMode(String d) {
			if (d.equalsIgnoreCase("in person")||d.equalsIgnoreCase("in-person")|| d.equalsIgnoreCase("online")||d.equalsIgnoreCase("hydrid")) {
				this.instructMode = d;
			} else {
				this.instructMode= "unknown instructional mode";
			}
		}
		
		public String getInstructMode() {
			return instructMode.toString();
		}
		
		// creating a setter and getter for variable meetDays
		// the program will only set the value if the variable instruct mode is equal to in(-)person or hybrid 
		public void setMeetDays(String e) {
			if (instructMode.equalsIgnoreCase("in person")||instructMode.equalsIgnoreCase("in-person")||instructMode.equalsIgnoreCase("hybrid")) {
				this.meetDays= e;
			} else {
				this.meetDays = "N/A";
			}
		}
		
		public String getMeetDays() {
			return meetDays.toString();
		}
		
		// creating a setter and getter for variable meetTimes
		// the program will only set the value if the variable instructMode is equal to in(-)person or hybrid 
		public void setMeetTimes(String f) {
			if ((instructMode.equalsIgnoreCase("in person"))||(instructMode.equalsIgnoreCase("in-person"))||(instructMode.equalsIgnoreCase("hybrid"))) {
				this.meetTimes = f;
		} else {
				this.meetTimes = "N/A";
			}
		}
		
		public String getMeetTimes() {
			return meetTimes.toString();
		}
		
		//creating a setter and getter for variable classCap
		public void setClassCap(int g) {
			this.classCap = g;
		}
		
		public int getClassCap() {
			return classCap;
		}
		
		// creating a setter and getter for variable classEnroll
		public void setClassEnroll(int h) {
			this.classEnroll = h;
		}
		
		public int getClassEnroll() {
			return classEnroll;
		}
		
		public void setIdNum(int i) {
			this.idNum=i;
		}
		
		// creating a setter and getter for variable idNum
		public int getIdNum() {
			return idNum;
		}
		
		//creating a method function toString() that will call all of the getter functions with labels 
		@Override
		public String toString(){
			return "CRN: "+ getCRN()
			+"\nDepartment: "+ getDepartCode()
			+"\nCourse number: "+getCourseNum()
			+"\nInstructional mode: "+getInstructMode()
			+"\nMeeting days: "+ getMeetDays()
			+"\nMeeting times: "+ getMeetTimes()
			+"\nCapacity: "+getClassCap()
			+"\nEnrollment: "+getClassEnroll()
			+"\nInstructor’s ID: "+ getIdNum();
		}
		
	}
