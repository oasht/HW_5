package task_1_4_2;

public class Main {
    public static void main(String[] args) {
        Point p1=new Point(1,3);
        Point p2=new Point (23,8);
        Line l1=new Line(p1,p2);
        Line l2=new Line(5,10,25,10);
        Line l3=new Line(p1.x, p1.y, l2.two.x, l2.two.y);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
