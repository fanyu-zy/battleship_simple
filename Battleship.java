import java.util.Random;

public class Battleship {
	/* 
	 * Record whether the ship was sunk, the ship's life value, and the ship's position.
	 *
	 */
	 *  vate boolean shipsunk = false;
	 rivate int rehealth = 0;
	private int shipsize = 0;
	private int shipNo = 0;
	private int[][] shiplocation = new int[10][10];
	Random shipnum = new Random();
	boolean flag = false;
	
	/*

	 * public Battleship(int Size, int[][] board) {}
	 * continuously generate new positions and directions by Size qualification 
	 * until the warship is established The specific method is:
	 *  Generate the first p
	 * int randoml Use random to determine 
	 *  
	 * 
	

		setShipsunk(false); 
		se tShiplocation(board);
		setShipNo(shipNo);
	}



		try {
			i f(board[x][y]==0)
				return false;
			el se  
				return true;
		}catch(ArrayIndexOutOfBoundsException e) {
			//Equating access out of bounds with possession
			 retur n true;
		} 
	}
	
	/

		r ehealth--;
		if(rehealth==0) {
			shipsunk = true;
		}   
		return shipsunk;
	}
	
	p

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



	}



	}



	}



	}

	

