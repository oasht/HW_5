package task_1_4_9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        List<Point> points_1 = new ArrayList<>();
        points_1.add(p1);
        points_1.add(p2);
        points_1.add(p3);
        LineExtended line_1 = new LineExtended(points_1);
        LineExtended line_2 = new LineExtended();
        System.out.println(line_1);
        System.out.println(line_2);
    }
}