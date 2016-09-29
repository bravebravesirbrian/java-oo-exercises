
public class BaseballPlayer {

	private String name;
	private String hand;
	private int jerseyNumber;
	private int games;
	private int runs;
	private int RBI;
	
	public BaseballPlayer (String name, String hand, int jerseyNumber, int games, int runs, int RBI){
		this.name=name;
		this.hand=hand;
		this.jerseyNumber=jerseyNumber;
		this.games=games;
		this.runs=runs;
		this.RBI=RBI;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getHand(){
		return this.hand;
	}
	
	public int getJerseyNumber(){
		return this.jerseyNumber;
	}
	
	public int getGames(){
		return this.games;
	}
	
	public int getRuns(){
		return this.runs;
	}
	
	public String playGame(int runsScored, int RBIScored){
		this.games = this.games + 1;
		this.runs = this.runs + runsScored;
		this.RBI = this.RBI + RBIScored;
		return this.name + " just finished a game! " + this.name + " has now played " + this.games + " game(s). " + this.name + " scored " + runsScored + " runs and " + RBIScored + " RBIs this game. " + this.name + " has scored " + this.runs + " runs and " + this.RBI + " RBIs in their career.";
	}
	
	public int getRBI(){
		return this.RBI;
	}
	
	public String toString(){
		return "Name: " + this.name + " Hits with: " + this.hand + " hand Jersey Number: " + this.jerseyNumber + " Games Played: " + this.games + " Runs Scored: " + this.runs + " Runs Batted In (RBI): " + this.RBI;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseballPlayer jackieRobinson = new BaseballPlayer ("Jackie Robinson", "Right", 42, 0, 0, 0);
		System.out.println(jackieRobinson);
		System.out.println();
		System.out.println(jackieRobinson.playGame(7, 21));
		System.out.println();
		System.out.println(jackieRobinson);
		System.out.println();
		System.out.println(jackieRobinson.playGame(3, 6));
		System.out.println();
		System.out.println(jackieRobinson);
	}

}
