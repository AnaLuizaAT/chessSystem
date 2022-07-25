package src.boardgame;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position {
    private int row;
    private int column;

    @Override
    public String toString() {
        return row + "," + column;
    }
}
