
public class Course {
	
	private String name;
	private int credits;
	private int seats;
	private int open;
	private Student[] roster;
	
	public Course(String name, int credits, int seats){
		this.name = name;
		this.credits = credits;
		this.seats = seats;
		this.open = this.seats;
		this.roster = new Student[this.seats];
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getCredits(){
		return this.credits;
	}
	
	public int getRemainingSeats(){
		return this.open;
	}
	
	public boolean addStudent(Student s2){
		if (this.open > 0){
			if ((this.seats - this.open) > 0){
				for (int i = 0; i < (this.seats - this.open); i++){
					if (this.roster[i].getName() == s2.getName()){
						return false;
					}
				}
			}
			this.roster[this.seats - this.open] = s2;
			this.open = this.open - 1;
			return true;
		}
		else{
			return false;
		}
	}
	
	public double averageGPA(){
		double s = 0;
		for (int i = 0; i < this.seats-this.open; i++){
			s=s+roster[i].getGPA();
		}
		double avg=s/(this.seats-this.open);
		return avg;
		
	}
	
	public String toString(){
		return this.name + " " + this.credits;
	}

	public static void main(String[] args) {

	}

}
