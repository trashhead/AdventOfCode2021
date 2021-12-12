package Day9;

import lombok.Data;

@Data
public class CoordDay9 {
    int loc;
    boolean taken;

    public CoordDay9(int loc) {
        this.loc = loc;
    }
}
