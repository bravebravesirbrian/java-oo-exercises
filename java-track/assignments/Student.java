
public class Student {
	
	private String firstName;
	private String lastName;
	private int studentID;
	private double GPA;
	private double GPATotal;
	private int credits;
	
	public Student(String firstName, String lastName, int studentID){
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.GPA = 0.0;
		this.GPATotal = 0.0;
		this.credits = 0;
	}
	
	public String getName(){
		return this.firstName + " " + this.lastName;
	}
	
	public int getStudentID(){
		return this.studentID;
	}
	
	public void submitGrade(double g, int c){
		this.GPATotal = this.GPATotal + (g * c);
		this.credits = this.credits + c;
		this.GPA = ((double)Math.round((this.GPATotal/this.credits)*1000d)/1000d);
	}
	
	public double getGPA(){
		return this.GPA;
	}
	
	public int getCredits(){
		return this.credits;
	}
	
	public String getClassStanding(){
		if (this.credits < 30){
			return "Freshman";
		}
		else if (this.credits >= 30 && this.credits < 60){
			return "Sophomore";
		}
		else if (this.credits >= 60 && this.credits < 90){
			return "Junior";
		}
		else{
			return "Senior";
		}
	}
	
	public double computeTuition(){
		int t = this.credits;
		return ((double)Math.round((20000.0*t/15)*100d)/100d);
	}
	
	public Student createLegacy(Student s, Student ss){
		Student bb = new Student(s.getName(),ss.getName(),s.getStudentID()+ss.getStudentID());
		bb.credits =Math.max(s.getCredits(), ss.getCredits());
		bb.GPA=((s.GPA+ss.GPA)/2);
		return bb;
	}
	
	public String toString(){
		return this.firstName + " " + this.lastName + "," + this.studentID;
	}

	public static void main(String[] args) {
		

	}

}
