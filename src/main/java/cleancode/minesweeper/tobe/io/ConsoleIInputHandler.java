package cleancode.minesweeper.tobe.io;

import java.util.Scanner;

import cleancode.minesweeper.tobe.BoardIndexConverter;
import cleancode.minesweeper.tobe.position.CellPosition;
import cleancode.minesweeper.tobe.user.UserAction;

public class ConsoleIInputHandler implements InputHandler{

    public static final Scanner SCANNER = new Scanner(System.in);

    private final BoardIndexConverter boardIndexConverter = new BoardIndexConverter();

    @Override
    public UserAction getUserActionFromUser() {
        String userInput = SCANNER.nextLine();

        if("1".equals(userInput)){
            return UserAction.OPEN;
        }
        if("2".equals(userInput)){
            return UserAction.FLAG;
        }

        return UserAction.UNKNOWN;
    }

    @Override
    public CellPosition getCellPostionFromUser() {
        String userInput = SCANNER.next();
        int colIndex = boardIndexConverter.getSelectedColIndex(userInput);
        int rowIndex = boardIndexConverter.getSelectedColIndex(userInput);
        return CellPosition.of(rowIndex, colIndex);
    }
}
