
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
	
	public void changePosition(){
		if(this.direction == "North"){
			this.positionY = this.positionY + this.speed;
		}
		else if(this.direction == "South"){
			this.positionY = this.positionY - this.speed;
		}
		else if(this.direction == "East"){
			this.positionX = this.positionX + this.speed;
		}
		else if(this.direction == "West"){
			this.positionX = this.positionX - this.speed;
		}
		else{
			return;
		}
	}
	
	public void changeDirection(String turn){
		if(this.direction == "South" && turn == "Right"){
			this.direction = "West";
		}
		else if(this.direction == "South" && turn == "Left"){
			this.direction = "East";
		}
		else if(this.direction == "East" && turn == "Right"){
			this.direction = "South";
		}
		else if(this.direction == "East" && turn == "Left"){
			this.direction = "North";
		}
		else if(this.direction == "North" && turn == "Right"){
			this.direction = "East";
		}
		else if(this.direction == "North" && turn == "Left"){
			this.direction = "West";
		}
		else if(this.direction == "West" && turn == "Right"){
			this.direction = "North";
		}
		else if(this.direction == "West" && turn == "Left"){
			this.direction = "South";
		}
		else{
			return;
		}
	}
	
	public String toString(){
		return "Name: " + this.name + " Position: (" + this.positionX + "," + this.positionY + ") Speed: " + this.speed + " Direction: " + this.direction;
	}
	
	public static void main(String[] args) {
		Robot myRobot = new Robot("myRobot", 5, 4, 3, "South");
		System.out.println(myRobot);
		myRobot.changePosition();
		System.out.println("New postion: (" + myRobot.getPositionX() + "," + myRobot.getPositionY() + ")");
		myRobot.changeDirection("Right");
		System.out.println("New direction: " + myRobot.getDirection());
		Robot yourRobot = new Robot("yourRobot", -2, -6, 4, "East");
		System.out.println();
		System.out.println(yourRobot);
		yourRobot.changePosition();
		System.out.println("New postion: (" + yourRobot.getPositionX() + "," + yourRobot.getPositionY() + ")");
		yourRobot.changeDirection("Left");
		System.out.println("New direction: " + yourRobot.getDirection());
	}

}
