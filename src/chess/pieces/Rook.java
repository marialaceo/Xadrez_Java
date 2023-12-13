package chess.pieces;

import boardgame.Board;
import chess.ChessException;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        if(getColor() == Color.WHITE){
            return "♖";
        } else if (getColor() == Color.BLACK) {
            return "♜";
        }else {
            throw new ChessException("Esta não é uma cor válida. Tente WHITE ou BLACK");
        }
    }
}
