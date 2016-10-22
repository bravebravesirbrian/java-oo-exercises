
public class Robot {
	
	private String name;
	private int positionX;
	private int positionY;
	private int speed;
	private String direction;
	
	public Robot(String name, int positionX, int positionY, int speed, String direction){
		this.name = name;
		this.positionX = positionX;
		this.positionY = positionY;
		this.speed = speed;
		this.direction = direction;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getPositionX(){
		return this.positionX;
	}
	
	public int getPositionY(){
		return this.positionY;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public String getDirection(){
		return this.direction;
	}
	
	public String changePosition(){
		if(this.direction == "North"){
			this.positionY = this.positionY + this.speed;
			return "New postion: (" + this.positionX + "," + this.positionY + ")";
		}
		else if(this.direction == "South"){
			this.positionY = this.positionY - this.speed;
			return "New postion: (" + this.positionX + "," + this.positionY + ")";
		}
		else if(this.direction == "East"){
			this.positionX = this.positionX + this.speed;
			return "New postion: (" + this.positionX + "," + this.positionY + ")";
		}
		else if(this.direction == "West"){
			this.positionX = this.positionX - this.speed;
			return "New postion: (" + this.positionX + "," + this.positionY + ")";
		}
		else{
			return "";
		}
	}
	
	public String changeDirection(String turn){
		if(this.direction == "South" && turn == "Right"){
			this.direction = "West";
			return "New direction: " + this.direction;
		}
		else if(this.direction == "South" && turn == "Left"){
			this.direction = "East";
			return "New direction: " + this.direction;
		}
		else if(this.direction == "East" && turn == "Right"){
			this.direction = "South";
			return "New direction: " + this.direction;
		}
		else if(this.direction == "East" && turn == "Left"){
			this.direction = "North";
			return "New direction: " + this.direction;
		}
		else if(this.direction == "North" && turn == "Right"){
			this.direction = "East";
			return "New direction: " + this.direction;
		}
		else if(this.direction == "North" && turn == "Left"){
			this.direction = "West";
			return "New direction: " + this.direction;
		}
		else if(this.direction == "West" && turn == "Right"){
			this.direction = "North";
			return "New direction: " + this.direction;
		}
		else if(this.direction == "West" && turn == "Left"){
			this.direction = "South";
			return "New direction: " + this.direction;
		}
		else{
			return "";
		}
	}
	
	public String otherRobot(Robot other){
		int distanceX = (this.positionX - other.positionX);
		int distanceY = (this.positionY - other.positionY);
		if (distanceX < 0){
			distanceX = distanceX * -1;
		}
		if (distanceY < 0){
			distanceY = distanceY * -1;
		}
		String eastWest = "";
		String northSouth = "";
		if (this.positionX > other.positionX){
			eastWest = "west";
		}
		if (this.positionX < other.positionX){
			eastWest = "east";
		}
		if (this.positionY > other.positionY){
			northSouth = "south";
		}
		if (this.positionY < other.positionY){
			northSouth = "north";
		}
		return other.name + " is " + distanceX + " points " + eastWest + " and " + distanceY + " points " + northSouth + " of " + this.name + ".";
	}
	
	public String toString(){
		return "Name: " + this.name + " Position: (" + this.positionX + "," + this.positionY + ") Speed: " + this.speed + " Direction: " + this.direction;
	}
	
	public static void main(String[] args) {
		Robot myRobot = new Robot("myRobot", 5, 4, 3, "South");
		System.out.println(myRobot);
		System.out.println(myRobot.changePosition());
		System.out.println(myRobot.changeDirection("Right"));
		System.out.println();
		Robot yourRobot = new Robot("yourRobot", -2, -6, 4, "East");
		System.out.println(yourRobot);
		System.out.println(yourRobot.changePosition());
		System.out.println(yourRobot.changeDirection("Left"));
		System.out.println();
		System.out.println(myRobot.otherRobot(yourRobot));
		System.out.println(yourRobot.otherRobot(myRobot));
	}

}
