package task_1_2_1;

public class Line {
    Point one;
    Point two;

    public Line(Point one, Point two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public String toString() {
        return "Линия от {"+one.x+";"+one.y+"} до {"+two.x+";"+two.y+"}";
    }
}
