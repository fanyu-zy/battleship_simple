import java.util.Scanner;

public class Main {
	/*
	 * Game: Battleship Two users take turns playing the game, each with their own
	 * board Whoever sinks all the ships first will win There are six Battleships in
	 * total 3 SmallBattleship 2 MediumBattleship 1 LargeBattleship
	 * 
	 * Game play introduction: Enter the names of two users separately to start the
	 * game. Each time enter a guess, x and y should be between 0 and 9 (including 0
	 * and 9)
	 * 
	 */
	public static void main(String[] args) {
		// Enter the names of two users
		Scanner playername = new Scanner(System.in);
		System.out.println("Please enter the player1 name:");
		String player1 = playername.nextLine();
		Board forplayer1 = new Board();
		Player play1 = new Player(player1, forplayer1);
		System.out.println("Please enter the player2 name:");
		String player2 = playername.nextLine();
		Board forplayer2 = new Board();
		Player play2 = new Player(player2, forplayer2);
		// Set up a loop flag, one of the two players wins
		boolean onewin = false;
		while (!onewin) {
			// First player to play the game
			play1.takeTurn();
			// Show player scores
			System.out.println(play1);
			if (play1.Playerwin == true) {
				onewin = true;
				System.out.println("Congratulations to " + play1.getUsername() + "!");
				// First hand advantage, if win then direct judgment win
				// The other player does not have to make a choice
				break;
			}
			// Another player
			play2.takeTurn();
			System.out.println(play2);
			if (play2.Playerwin == true) {
				onewin = true;
				System.out.println("Congratulations to " + play2.getUsername() + "!");
			}
		}
		playername.close();
	}
}
