package pimaClass;

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
			if ((d.equalsIgnoreCase("in person"))||(d.equalsIgnoreCase("in-person"))|| (d.equalsIgnoreCase("online"))||(d.equalsIgnoreCase("hydrid"))) {
				this.instructMode = d;
			} else {
			this.instructMode= "unknown instructional mode";
			}
		}
		
		public String getInstructMode() {
			return instructMode.toString();
		}
		
		public void setMeetDays(String e) {
			if ((instructMode.equalsIgnoreCase("in person"))||(instructMode.equalsIgnoreCase("in-person"))||(instructMode.equalsIgnoreCase("hybrid"))) {
				this.meetDays= e;
			} else {
				this.meetDays = "N/A";
			}
		}
		
		public String getMeetDays() {
			return meetDays.toString();
		}
		
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
		
		public void setIdNum(int i) {
			this.idNum=i;
		}
		
		public int getIdNum() {
			return idNum;
		}
		public void classDetails(){
		
			System.out.println("CRN: "+ Integer.toString(CRN));
			System.out.println("Instructional mode: "+instructMode.toString());
			System.out.println("Department: "+departCode.toString());
			System.out.println("Course number: "+Integer.toString(courseNum));
			System.out.println("Meeting days"+meetDays.toString());
			System.out.println("Meeting times: "+ meetTimes.toString());
			System.out.println("Capacity: "+Integer.toString(classCap));
			System.out.println("Enrollment: "+Integer.toString(classEnroll));
			System.out.println("Instructor’s ID: "+ Integer.toString(idNum));
			
		}
		
	}
