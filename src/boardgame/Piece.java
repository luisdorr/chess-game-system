package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    public Piece[][] possibleMoves() {
        return null;
    }

    protected Board getBoard() {
        return board;
    }
}
