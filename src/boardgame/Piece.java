package src.boardgame;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Piece {
    protected Position position;
    private Board board;

    protected Board getBoard() {
        return board;
    }
}
