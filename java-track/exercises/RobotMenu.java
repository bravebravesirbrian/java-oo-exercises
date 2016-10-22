import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {
	
	private ArrayList<Robot> robots;
	private Scanner s;

	public static void main(String[] args) {
		int input = 0;
		RobotMenu rm = new RobotMenu();
		do {
			input = rm.startMenu();
			rm.processInput(input);
		} while (input != 6);
	}
	
	public RobotMenu() {
		s = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}

	public int startMenu() {
		System.out.println("Welcome to the robot menu!");
		System.out.println("1. Create a robot.");
		System.out.println("2. Display the list of available robots.");
		System.out.println("3 Move a robot.");
		System.out.println("4 Rotate a robot.");
		System.out.println("5 Compute the distance between two robots.");
		System.out.println("6 Exit.");
		System.out.println("Please select an option: ");
		int input = this.s.nextInt();
		while(input < 0 || input > 6){
			System.out.println("Invalid selection, please try again: ");
			input = this.s.nextInt();
		}
		return input;
	}
	
	public void processInput(int input){
		if (input == 1){
			createRobot();
		}
		else if (input == 2){
			displayRobots();
		}
		else if (input == 3){
			if (robots.size() <1){
				System.out.println("There are no robots to move");
			}
			else {
				displayRobots();
				Robot r = selectRobot();
				System.out.println("Please enter an x-coordinate for the robot to move to: ");
				int dist = s.nextInt();
				while(dist < 1){
					System.out.println("Invalid value.  Please enter a positive value: ");
				}
			}
			
			r.setDistance(dist);
			
		}
	}
	
	
}
