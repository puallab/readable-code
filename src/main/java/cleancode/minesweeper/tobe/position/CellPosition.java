package cleancode.minesweeper.tobe.position;

import java.util.Objects;

public class CellPosition {
	private final int rowIndex;
	private final int colIndex;

	public CellPosition(int rowIndex, int colIndex) {
		if(rowIndex < 0 || colIndex < 0){
			throw new IllegalArgumentException("올바르지 않은 좌표입니다.");
		}
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
	}

	public static CellPosition of(int rowIndex, int colIndex){
		return new CellPosition(rowIndex, colIndex);
	}

	public boolean canCalculatePositionBy(RelativePosition relativePosition){
		return this.rowIndex + relativePosition.getDeltaRow() >= 0
			&& this.colIndex + relativePosition.getDeltaCol() >= 0;
	}

	public CellPosition calculatePositionBy(RelativePosition relativePosition){
		if(this.canCalculatePositionBy(relativePosition)){
			return CellPosition.of(
				this.rowIndex+relativePosition.getDeltaRow(),
				this.colIndex+relativePosition.getDeltaRow()
			);
		}
		throw new IllegalArgumentException("잘못된 좌표입니다.");
	}
	@Override
	public int hashCode() {
		return Objects.hash(rowIndex, colIndex);

	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CellPosition that = (CellPosition)o;
		return rowIndex == that.rowIndex && colIndex == that.colIndex;
	}

	public boolean isRowIndexMoreThanOrEqual(int rowIndex){
		return this.rowIndex > rowIndex;
	}

	public boolean isColIndexMoreThanOrEqual(int colIndex){
		return this.colIndex > colIndex;
	}

	public int getColIndex() {
		return this.colIndex;
	}

	public int getRowIndex(){
		return this.rowIndex;
	}

	public boolean isRowIndexLessThan(int rowIndex){
		return this.rowIndex <= rowIndex;
	}

	public boolean isColIndexLessThan(int colIndex){
		return this.colIndex <= colIndex;
	}
}

