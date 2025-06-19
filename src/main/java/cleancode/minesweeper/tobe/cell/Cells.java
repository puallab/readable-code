package cleancode.minesweeper.tobe.cell;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cells {
	private final List<Cell> cells;

	public Cells(List<Cell> cells) {
		this.cells = cells;
	}

	public static Cells of(List<Cell> cells){
		return new Cells(cells);
	}

	public static Cells from(Cell[][] cells) {
		List<Cell> cellList = Arrays.stream(cells)
			.flatMap(Arrays::stream)
			.collect(Collectors.toList());
		return of(cellList);
	}

	public boolean isAllChecked() {
		return cells.stream()
			.allMatch(Cell::isChecked);
	}
}
