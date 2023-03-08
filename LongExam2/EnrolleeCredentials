public class EnrolleeCredentials extends EnrolmentForm {

	String firstName, lastName, IDnumber, courseName, studentType;
	int tuitionFee, miscellaneousFee;
	
	public EnrolleeCredentials(String fName, String lName, String IDN, String cName, String sType) {
		this.firstName = fName;
		this.lastName = lName;
		this.IDnumber = IDN;
		this.courseName = cName;
		this.studentType = sType;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getIDNumber() {
		return IDnumber;
	}
	
	public void setIDNumber(String IDnumber) {
		this.IDnumber = IDnumber;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName (String courseName) {
		this.courseName = courseName;
	}
	
	public String getStudentType() {
		return studentType;
	}
	
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	
  // Returns the tuition fee that correspond to the course
	public static int tuitionFees(String courseName, int tuitionFee) {
		tuitionFee = 0;
		String courseOffered = courseName.toUpperCase();
		
		switch (courseOffered) {
		case "TOURISM":
			tuitionFee = 10000;
		break;
		case "ENGINEERING":
			tuitionFee = 30000;
		break;
		case "COMPUTER SCIENCE":
			tuitionFee = 20000;
		break;
		case "NURSING":
			tuitionFee = 15000;
		break;
		case "ARCHITECTURE":
			tuitionFee = 25000;
		break;
		}
		
		return tuitionFee;
	}
	
  // Returns the miscellaneous fee that correspond to the course
	public static int miscellaneousFees(String course, int miscellaneuosFee) {
		miscellaneuosFee = 0;
		String courseOffered = course;
		
		switch (courseOffered) {
		case "Tourism":
			miscellaneuosFee = 22500;
		break;
		case "Engineering":
			miscellaneuosFee = 25000;
		break;
		case "Computer Science":
			miscellaneuosFee = 11000;
		break;
		case "Nursing":
			miscellaneuosFee = 15000;
		break;
		case "Architecture":
			miscellaneuosFee = 23000;
		break;
		}
		
		return miscellaneuosFee;
	}
	
  // Returns the Total Fees payable based on Student Type
	public static int totalFees (String studentType, String course, int tuitionFee, int miscellaneuosFee) {
		double totalFee = 0;
		double tf = tuitionFees(course, tuitionFee);
		double mf = miscellaneousFees(course, miscellaneuosFee);
		
		String studentOffer = studentType.toUpperCase();
		switch (studentOffer) {
		case "DISCOUNTED (GOLD)":
			totalFee = (int) (tf + mf) * 0.5;
		break;
		case "DISCOUNTED (BLUE)":
			totalFee = (int) (tf + mf) * 0.7;
		break;
		case "DISCOUNTED (WHITE)":
			totalFee = (int) (tf + mf) * 0.9;
		break;
		case "WALK-IN":
			totalFee = (int) (tf + mf);
		break;
		case "CONTINUING":
			totalFee = (int) (tf * 0.9) + mf;
		break;
		}

		return (int) totalFee;
	}
	
}
