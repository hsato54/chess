package chess;
/**
 * A chessboard that can hold and rearrange chess pieces.
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessBoard {

    private ChessPiece[][] board;

    public ChessBoard() {
    }

    /**
     * Adds a chess piece to the chessboard
     *
     * @param position where to add the piece to
     * @param piece    the piece to add
     */
    public void addPiece(ChessPosition position, ChessPiece piece) {
        //throw new RuntimeException("Not implemented");
            int row = position.getRow();
            int col = position.getColumn();
            board [row][col] = piece;
    }

    /**
     * Gets a chess piece on the chessboard
     *
     * @param position The position to get the piece from
     * @return Either the piece at the position, or null if no piece is at that
     * position
     */
    public ChessPiece getPiece(ChessPosition position) {
        //throw new RuntimeException("Not implemented");
        int row = position.getRow();
        int col = position.getColumn();
        return board[row][col];
    }

    public void resetBoard() {
        //throw new RuntimeException("Not implemented");
        board = new ChessPiece[8][8];
        //white pieces
        board[0][0] = new ChessPiece(PieceType.ROOK, "WHITE");
        board[0][1] = new ChessPiece(PieceType.KNIGHT, "WHITE");
        board[0][2] = new ChessPiece(PieceType.BISHOP, "WHITE");
        board[0][3] = new ChessPiece(PieceType.QUEEN, "WHITE");
        board[0][4] = new ChessPiece(PieceType.KING, "WHITE");
        board[0][5] = new ChessPiece(PieceType.BISHOP, "WHITE");
        board[0][6] = new ChessPiece(PieceType.KNIGHT, "WHITE");
        board[0][7] = new ChessPiece(PieceType.ROOK, "WHITE");
        //pawns
        board[1][0] = new ChessPiece(PieceType.PAWN, "WHITE");
        board[1][1] = new ChessPiece(PieceType.PAWN, "WHITE");
        board[1][2] = new ChessPiece(PieceType.PAWN, "WHITE");
        board[1][3] = new ChessPiece(PieceType.PAWN, "WHITE");
        board[1][4] = new ChessPiece(PieceType.PAWN, "WHITE");
        board[1][5] = new ChessPiece(PieceType.PAWN, "WHITE");
        board[1][6] = new ChessPiece(PieceType.PAWN, "WHITE");
        board[1][7] = new ChessPiece(PieceType.PAWN, "WHITE");
        //black pieces
        board[7][0] = new ChessPiece(PieceType.ROOK, "BLACK");
        board[7][1] = new ChessPiece(PieceType.KNIGHT, "BLACK");
        board[7][2] = new ChessPiece(PieceType.BISHOP, "BLACK");
        board[7][3] = new ChessPiece(PieceType.QUEEN, "BLACK");
        board[7][4] = new ChessPiece(PieceType.KING, "BLACK");
        board[7][5] = new ChessPiece(PieceType.BISHOP, "BLACK");
        board[7][6] = new ChessPiece(PieceType.KNIGHT, "BLACK");
        board[7][7] = new ChessPiece(PieceType.ROOK, "BLACK");
        //pawns
        board[6][0] = new ChessPiece(PieceType.PAWN, "BLACK");
        board[6][1] = new ChessPiece(PieceType.PAWN, "BLACK");
        board[6][2] = new ChessPiece(PieceType.PAWN, "BLACK");
        board[6][3] = new ChessPiece(PieceType.PAWN, "BLACK");
        board[6][4] = new ChessPiece(PieceType.PAWN, "BLACK");
        board[6][5] = new ChessPiece(PieceType.PAWN, "BLACK");
        board[6][6] = new ChessPiece(PieceType.PAWN, "BLACK");
        board[6][7] = new ChessPiece(PieceType.PAWN, "BLACK");
    }
}
