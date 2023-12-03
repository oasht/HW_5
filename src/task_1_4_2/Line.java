package task_1_4_2;

public class Line {
    Point one;
    Point two;

    public Line(Point one, Point two) {
        this.one = one;
        this.two = two;
    }
    public Line(int x,int y,int z,int w )
    {
        this.one = new Point(x, y);
        this.two = new Point(z, w);

    }

    @Override
    public String toString() {
        return "Линия от {"+one.x+";"+one.y+"} до {"+two.x+";"+two.y+"}";}
}
