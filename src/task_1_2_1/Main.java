package task_1_2_1;

public class Main {
    public static void main(String[] args) {
//        Point p1=new Point(1,3);
//        Point p2=new Point (20,8);
//        Point p3=new Point (5,15);
//        Point p4=new Point (25,10);
        Point p1=new Point();
        Point p2=new Point ();
        Point p3=new Point ();
        Point p4=new Point ();
        p1.x=1;
        p1.y=3;
        p2.x=20;
        p2.y=8;
        p3.x=5;
        p3.y=15;
        p4.x=25;
        p4.y=10;
        Line l1=new Line(p1,p2);
        Line l2=new Line(p3,p4);
        Line l3=new Line(p1,p4);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        p1.x=3;
        p1.y=4;
        p2.x=25;
        p2.y=13;
        p3.x=7;
        p3.y=23;
        p4.x=40;
        p4.y=13;
        System.out.println("******************************************************");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        p2.x=9;
        p2.y=19;
        System.out.println("******************************************************");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
