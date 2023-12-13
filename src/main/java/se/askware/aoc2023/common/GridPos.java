package se.askware.aoc2023.common;

public class GridPos extends Pair<Integer> {

	public GridPos(Integer row, Integer col) {
		super(row, col);
	}

	public int getRow(){
		return getFirst();
	}

	public int getCol(){
		return getSecond();
	}

	public GridPos translate(GridPos other){
		return new GridPos(getRow() + other.getRow(), getCol() + other.getCol());
	}

	public int distance(GridPos other){
		return Math.abs(getRow() - other.getRow()) + Math.abs(getCol() - other.getCol());
	}

}
