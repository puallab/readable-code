package cleancode.minesweeper.tobe.cell;

public interface Cell {

     abstract boolean isLandMine();

     abstract boolean hasLandMineCount();

     CellSnapshot getSnapshot();

     void flag();

     void open();

     boolean isChecked();

     boolean isOpened();
}
