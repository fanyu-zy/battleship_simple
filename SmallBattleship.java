public class SmallBattleship extends Battleship {

	private int SmallNum = 3;

	public SmallBattleship(int[][] board, int shipNo) {
		super(board, shipNo);
		setRehealth(1);
		setShipsize(1);
		int[][] shiplocation = board;
		int linenum = 0;
		int columnnum = 0;
		while (!flag) {
			linenum = shipnum.nextInt(10);
			columnnum = shipnum.nextInt(10);
			if (isShip(linenum, columnnum, board) == true) {
				continue;
			} else {
				flag = true;
				shiplocation[linenum][columnnum] = shipNo;
				setShiplocation(shiplocation);
			}
		}
	}

	public int getSmallNum() {
		return SmallNum;
	}

}
