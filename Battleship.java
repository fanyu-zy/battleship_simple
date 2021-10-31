import java.util.Random;

public class Battleship {
	/*
	 * Record whether the ship was sunk, the ship's life value, and the ship's
	 * position. shiplocation[x][y] = z : Position occupied by ship (shipNo is z)
	 */
	private boolean shipsunk = false;
	private int rehealth = 0;
	private int shipsize = 0;
	private int shipNo = 0;
	private int[][] shiplocation = new int[10][10];
	Random shipnum = new Random();
	boolean flag = false;

	/*
	 * If don't use subclasses, can use just one function to build the battleship.
	 * public Battleship(int Size, int[][] board) {} continuously generate new
	 * positions and directions by Size qualification until the warship is
	 * established The specific method is: Generate the first point randomly with
	 * Random (use this point as a header) Use random to determine if the remaining
	 * size is horizontal/vertical and up/down
	 */

	public Battleship(int[][] board, int shipNo) {
		// Set basic information
		setShipsunk(false);
		setShiplocation(board);
		setShipNo(shipNo);
	}

	public boolean isShip(int x, int y, int[][] board) {
		// Determine if there are other ships at the location
		try {
			if (board[x][y] == 0)
				return false;
			else
				return true;
		} catch (ArrayIndexOutOfBoundsException e) {
			// Equating access out of bounds with possession
			return true;
		}
	}

	// Detecting if a ship has been sunk
	public boolean getHit() {
		rehealth--;
		if (rehealth == 0) {
			shipsunk = true;
		}
		return shipsunk;
	}

	public boolean isShipsunk() {
		return shipsunk;
	}

	protected void setShipsunk(boolean shipsunk) {
		this.shipsunk = shipsunk;
	}

	public int getRehealth() {
		return rehealth;
	}

	protected void setRehealth(int rehealth) {
		this.rehealth = rehealth;
	}

	public int getShipsize() {
		return shipsize;
	}

	protected void setShipsize(int shipsize) {
		this.shipsize = shipsize;
	}

	public int[][] getShiplocation() {
		return shiplocation;
	}

	protected void setShiplocation(int[][] shiplocation) {
		this.shiplocation = shiplocation;
	}

	public int getShipNo() {
		return shipNo;
	}

	private void setShipNo(int shipNo) {
		this.shipNo = shipNo;
	}

}
