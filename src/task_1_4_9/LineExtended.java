package task_1_4_9;

import java.util.List;

public class LineExtended {
    List<Point> line;

    public LineExtended()
    {

    }

    public LineExtended(List<Point> line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "Линия " + line;
    }
}
