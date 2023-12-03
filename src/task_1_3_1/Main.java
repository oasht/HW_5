package task_1_3_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> grades_vasya=new ArrayList<>();
        grades_vasya.add(3);
        grades_vasya.add(4);
        grades_vasya.add(5);
        Student s1=new Student("Vasya", grades_vasya);
        System.out.println(s1);
        Student s2=new Student("Petya",grades_vasya);
        grades_vasya.remove(0);
        grades_vasya.add(0,5);
        System.out.println(s1);
        System.out.println(s2);
        List<Integer>grades_andrey=new ArrayList<>(grades_vasya);
        Student s3=new Student("Andrey", grades_andrey);
        grades_vasya.add(999);
        System.out.println("******************************************************");
        System.out.println(s3);
        System.out.println(s1);
    }
}
