import java.util.Scanner;

public class Player {

	private String username = null;
	private Board userBoard;
	private int userScore = 0;
	boolean Playerwin = false;
	Scanner playername = new Scanner(System.in);

	public Player(String name, Board playBoard) {
		setUsername(name);
		setUserScore(0);
		setUserBoard(playBoard);
	}

	public void takeTurn() {
		// Show whose turn it is
		System.out.println("\nNow it's " + username + "'s turn.");
		System.out.println(userBoard);
		System.out.print("Please select the shooting position(eg. 5 5):");
		String user1input = playername.nextLine();
		Scanner user1 = new Scanner(user1input);
		int user1x = user1.nextInt();
		int user1y = user1.nextInt();
		user1.close();
		playerChoice(user1x, user1y);
		// Show results
		System.out.println("Shooting results:");
		System.out.println(userBoard);
	}

	// User selects a location to attack
	// First check if the position has been selected or can be selected
	// Then detects if any of the ships are sunk after the player attacks
	// If sunk, determine if there are other ships on the board
	public void playerChoice(int x, int y) {
		if (userBoard.ifselected(x, y) == false) {
			if (userBoard.userhit(x, y) == true) {
				userScore++;
				if (userBoard.CheckBoard() == true)
					Playerwin = true;
			}
		} else {
			System.out.println("Position has been selected! Missing this round!");
		}
	}

	public String toString() {
		return "User: " + username + "\t Score:" + userScore;
	}

	public Board getUserBoard() {
		return userBoard;
	}

	public boolean getPlayerwin() {
		return Playerwin;
	}

	public void setUserBoard(Board userBoard) {
		this.userBoard = userBoard;
	}

	public int getUserScore() {
		return userScore;
	}

	public void setUserScore(int userScore) {
		this.userScore = userScore;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
