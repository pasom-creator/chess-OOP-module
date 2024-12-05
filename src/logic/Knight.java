package logic;

public class Knight extends ChessPiece {

    public Knight(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line < 0 || line > 7 || column < 0 || column > 7 || toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7)
            return false;

        int diffX = Math.abs(toLine - line);
        int diffY = Math.abs(toColumn - column);

        return (diffX == 1 && diffY == 2) || (diffX == 2 && diffY == 1);
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
