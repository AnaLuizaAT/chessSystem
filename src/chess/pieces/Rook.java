package src.chess.pieces;

import lombok.AllArgsConstructor;
import src.boardgame.Board;
import src.chess.ChessPiece;
import src.chess.Color;

@AllArgsConstructor
public class Rook extends ChessPiece {
    public Rook(Board board, Color white) {
    }

    @Override
    public String toString() {
        return "R";
    }
}
