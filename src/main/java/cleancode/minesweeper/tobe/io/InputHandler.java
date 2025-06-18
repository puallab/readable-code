package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.cell.position.CellPosition;

public interface InputHandler {

    String getUserInput();

    CellPosition getCellPostionFromUser();
}
