package src.chess.pieces;

import lombok.AllArgsConstructor;
import src.boardgame.Board;
import src.chess.ChessPiece;
import src.chess.Color;

@AllArgsConstructor
public class King extends ChessPiece {
    public King(Board board, Color black) {
    }

    @Override
    public String toString() {
        return "K";
    }
}
