public class Board {
	/*
	 * shipNo 1,2,3 Small 4,5 Medium 6 Large board[][] = 1~6 There is a ship
	 * board[][] = 8 Hit the ship, denoted by �� board[][] = 9 Missed shots, denoted
	 * by o
	 */
	private int[][] board = new int[10][10];
	private int shipNo = 1;
	SmallBattleship ship1, ship2, ship3;
	MediumBattleship ship4, ship5;
	LargeBattleship ship6;
	boolean getpoint = false;
	boolean gameover = false;

	public Board() {
		ship1 = new SmallBattleship(board, shipNo);
		shipNo++;
		board = ship1.getShiplocation();
		ship2 = new SmallBattleship(board, shipNo);
		shipNo++;
		board = ship2.getShiplocation();
		ship3 = new SmallBattleship(board, shipNo);
		shipNo++;
		board = ship3.getShiplocation();
		ship4 = new MediumBattleship(board, shipNo);
		shipNo++;
		board = ship4.getShiplocation();
		ship5 = new MediumBattleship(board, shipNo);
		shipNo++;
		board = ship5.getShiplocation();
		ship6 = new LargeBattleship(board, shipNo);
		board = ship6.getShiplocation();
	}

	// The user successfully attacks
	// If the ship is hit, monitor for sinking
	public boolean userhit(int x, int y) {
		getpoint = false;
		if (board[x][y] == 1) {
			board[x][y] = 8;
			getpoint = ship1.getHit();
		} else if (board[x][y] == 2) {
			board[x][y] = 8;
			getpoint = ship2.getHit();
		} else if (board[x][y] == 3) {
			board[x][y] = 8;
			getpoint = ship3.getHit();
		} else if (board[x][y] == 4) {
			board[x][y] = 8;
			getpoint = ship4.getHit();
		} else if (board[x][y] == 5) {
			board[x][y] = 8;
			getpoint = ship5.getHit();
		} else if (board[x][y] == 6) {
			board[x][y] = 8;
			getpoint = ship6.getHit();
		} else {
			board[x][y] = 9;
		}
		return getpoint;
	}

	// Check if all ships have been sunk
	public boolean CheckBoard() {
		gameover = true;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (board[i][j] == 1 || board[i][j] == 2 || board[i][j] == 3 || board[i][j] == 4 || board[i][j] == 5
						|| board[i][j] == 6)
					gameover = false;
			}
		}
		return gameover;
	}

	// Check if the location has been selected
	public boolean ifselected(int x, int y) {
		try {
			if (board[x][y] == 1 || board[x][y] == 2 || board[x][y] == 3 || board[x][y] == 4 || board[x][y] == 5
					|| board[x][y] == 6 || board[x][y] == 0)
				return false;
			else
				return true;
		} catch (ArrayIndexOutOfBoundsException e) {
			// Out-of-bounds elements are equivalent to being selected
			return true;
		}
	}

	public String toString() {
		String output = String.format("%20s", "The Board\n");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (board[i][j] == 9) {
					output += String.format("%3s", 'o');
				} else if (board[i][j] == 8) {
					output += String.format("%3s", '×');
				} else {
					output += String.format("%3s", '-');
				}
			}
			if (i != 9)
				output += '\n';
		}
		return output;
	}

	public int[][] getBoard() {
		return board;
	}
}
