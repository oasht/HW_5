package task_1_3_2;

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
        Point p4 = new Point(2, -5);
        Point p5 = new Point(4, -8);
        List<Point> points_2 = new ArrayList<>();
        points_2.add(p1);
        points_2.add(p4);
        points_2.add(p5);
        points_2.add(p3);
        LineExtended line_2 = new LineExtended(points_2);
        System.out.println(line_1);
        System.out.println(line_2);
        p1.x = 3;
        p1.y = 10;
        System.out.println(line_1);
        System.out.println(line_2);
    }
}