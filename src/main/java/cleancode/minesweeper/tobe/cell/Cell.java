package cleancode.minesweeper.tobe.cell;

public interface Cell {
     static final String FLAG_SIGN = "⚑";

     static final String UNCHECKED_SIGN = "□";

     abstract boolean isLandMine();

     abstract boolean hasLandMineCount();

     abstract String getSign();

     void flag();

     void open();

     boolean isChecked();

     boolean isOpened();
}
