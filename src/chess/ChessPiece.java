package src.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import src.boardgame.Piece;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class ChessPiece extends Piece {
    private Color color;
}