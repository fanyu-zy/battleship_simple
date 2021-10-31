public class MediumBattleship extends Battleship {

	private int MediumNum = 2;

	public MediumBattleship(int[][] board, int shipNo) {
		// Set basic information
		super(board, shipNo);
		setRehealth(2);
		setShipsize(2);
		int[][] shiplocation = board;
		// Determine the position and direction of the ship
		int linenum = 0;
		int columnnum = 0;
		boolean shipdir = false;
		boolean shipdir2 = false;
		// Enter the loop until the ship is successfully built
		while (!flag) {
			linenum = shipnum.nextInt(10);
			columnnum = shipnum.nextInt(10);
			if (isShip(linenum, columnnum, board) == true) {
				continue;
			} else {
				shipdir = shipnum.nextBoolean();// F for horizontal, T for vertical
				shipdir2 = shipnum.nextBoolean();// F for left/up, T for right/down
				if (shipdir == false) {
					if (shipdir2 == false) {
						if (isShip(linenum, columnnum - 1, board) == false) {
							shiplocation[linenum][columnnum] = shipNo;
							shiplocation[linenum][columnnum - 1] = shipNo;
							setShiplocation(shiplocation);
							flag = true;
						}
					} else {
						if (isShip(linenum, columnnum + 1, board) == false) {
							shiplocation[linenum][columnnum] = shipNo;
							shiplocation[linenum][columnnum + 1] = shipNo;
							setShiplocation(shiplocation);
							flag = true;
						}
					}
				} else {
					if (shipdir2 == false) {
						if (isShip(linenum - 1, columnnum, board) == false) {
							shiplocation[linenum][columnnum] = shipNo;
							shiplocation[linenum - 1][columnnum] = shipNo;
							setShiplocation(shiplocation);
							flag = true;
						}
					} else {
						if (isShip(linenum + 1, columnnum, board) == false) {
							shiplocation[linenum][columnnum] = shipNo;
							shiplocation[linenum + 1][columnnum] = shipNo;
							setShiplocation(shiplocation);
							flag = true;
						}
					}
				}

			}
		}
	}

	public int getMediumNum() {
		return MediumNum;
	}
}
