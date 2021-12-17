package Day15;

import lombok.Data;

@Data
public class Position {
    private int weight;
    private int x;
    private int y;
    private boolean visited;

    public Position(int x, int y, int weight) {
        this.weight = weight;
        this.x = x;
        this.y = y;
    }
}
