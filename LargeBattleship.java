public class LargeBattleship extends Battleship {

	private int LargeNum = 1;

	public LargeBattleship(int[][] board, int shipNo) {
		// Set basic information
		super(board, shipNo);
		setRehealth(3);
		setShipsize(3);
		int[][] shiplocation = board;
		// Determine the position and direction of the ship
		int x = 0;
		int y = 0;
		boolean shipdir = false;
		boolean shipdir2 = false;
		// Enter the loop until the ship is successfully built
		while (!flag) {
			x = shipnum.nextInt(10);
			y = shipnum.nextInt(10);
			if (isShip(x, y, board) == true) {
				continue;
			} else {
				shipdir = shipnum.nextBoolean();// F for horizontal, T for vertical
				shipdir2 = shipnum.nextBoolean();// F for left/up, T for right/down
				if (shipdir == false) {
					if (shipdir2 == false) {
						// Here can write functions that use size for function loops
						// But it's a little difficult for me at the moment
						// The simplest judgment was used
						if (isShip(x, y - 1, board) == false && isShip(x, y - 2, board) == false) {
							shiplocation[x][y] = shipNo;
							shiplocation[x][y - 1] = shipNo;
							shiplocation[x][y - 2] = shipNo;
							setShiplocation(shiplocation);
							flag = true;
						}
					} else {
						if (isShip(x, y + 1, board) == false && isShip(x, y + 2, board) == false) {
							shiplocation[x][y] = shipNo;
							shiplocation[x][y + 1] = shipNo;
							shiplocation[x][y + 2] = shipNo;
							setShiplocation(shiplocation);
							flag = true;
						}
					}
				} else {
					if (shipdir2 == false) {
						if (isShip(x - 1, y, board) == false && isShip(x - 2, y, board) == false) {
							shiplocation[x][y] = shipNo;
							shiplocation[x - 1][y] = shipNo;
							shiplocation[x - 2][y] = shipNo;
							setShiplocation(shiplocation);
							flag = true;
						}
					} else {
						if (isShip(x + 1, y, board) == false && isShip(x + 2, y, board) == false) {
							shiplocation[x][y] = shipNo;
							shiplocation[x + 1][y] = shipNo;
							shiplocation[x + 2][y] = shipNo;
							setShiplocation(shiplocation);
							flag = true;
						}
					}
				}
			}
		}
	}

	public int getLargeNum() {
		return LargeNum;
	}

}
